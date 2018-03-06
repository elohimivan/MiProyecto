package Modelo;

import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ModeloCombobox extends AbstractListModel
  implements ComboBoxModel
{
  List<Dispositivo> lista;
  String seleccion = "";
  int indexSeleccion = -1;
  
  public ModeloCombobox(List<Dispositivo> lista)
  {
    this.lista = lista;
  }
  
  @Override
  public Object getElementAt(int index)
  {
    return ((Dispositivo)this.lista.get(index)).getNombre();
  }
  
  @Override
  public int getSize()
  {
    return this.lista.size();
  }
  
  @Override
  public void setSelectedItem(Object unItem)
  {
    Iterator<Dispositivo> it = this.lista.iterator();

    while (it.hasNext())
    {
      Dispositivo di=(Dispositivo)it.next();
      String s = di.getNombre().trim();
      if (s.compareTo(unItem.toString().trim()) == 0)
      {
        this.seleccion = s;
        this.indexSeleccion = di.getId();
        return;
      }

    }
  }
  
  @Override
  public Object getSelectedItem()
  {
    return this.seleccion;
  }
  
  public int getSelectedId()
  {
    return this.indexSeleccion;
  }
}
