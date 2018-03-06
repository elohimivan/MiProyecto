package Modelo;

import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloCombobox
  extends AbstractListModel
  implements ComboBoxModel
{
  List<Dispositivo> lista;
  
  public ModeloCombobox(List<Dispositivo> lista)
  {
    this.lista = lista;
  }
  
  String seleccion = "";
  int indexSeleccion = -1;
  
  public Object getElementAt(int index)
  {
    return ((Dispositivo)this.lista.get(index)).getNombre();
  }
  
  public int getSize()
  {
    return this.lista.size();
  }
  
  public void setSelectedItem(Object unItem)
  {
    Iterator<Dispositivo> it = this.lista.iterator();
    int x = 0;
    while (it.hasNext())
    {
      String s = ((Dispositivo)it.next()).getNombre().trim();
      if (s.compareTo(unItem.toString().trim()) == 0)
      {
        this.seleccion = s;
        this.indexSeleccion = x;
        return;
      }
      x++;
    }
  }
  
  public Object getSelectedItem()
  {
    return this.seleccion;
  }
  
  public int getSelectedId()
  {
    return this.indexSeleccion;
  }
}
