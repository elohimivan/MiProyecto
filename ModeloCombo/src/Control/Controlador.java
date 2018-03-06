package Control;

import Modelo.Dispositivo;
import Modelo.ModeloCombobox;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class Controlador
  implements ActionListener
{
  private Vista vista;
  private List<Dispositivo> dispositivos;
  
  public Controlador(Vista vista)
  {
    this.vista = vista;
    this.dispositivos = new ArrayList();
    cargarLista();
  }
  
  private void cargarLista()
  {
    this.dispositivos.add(new Dispositivo(1, "Mouse", 25.0F));
    this.dispositivos.add(new Dispositivo(2, "Teclado", 25.0F));
    this.dispositivos.add(new Dispositivo(3, "CPU", 25.0F));
    this.dispositivos.add(new Dispositivo(6, "Monitor", 25.0F));
    
    ModeloCombobox modelo = new ModeloCombobox(this.dispositivos);
    this.vista.combo.setModel(modelo);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getActionCommand().compareTo("COMBO") == 0)
    {
      JComboBox c = (JComboBox)e.getSource();
      System.out.println(((ModeloCombobox)c.getModel()).getSelectedId());
    }
  }
}
