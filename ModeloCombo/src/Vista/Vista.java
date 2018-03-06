package Vista;

import Control.Controlador;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vista
  extends JFrame
{
  public JComboBox combo;
  
  public Vista()
  {
    Container com = getContentPane();
    com.setLayout(new FlowLayout());
    
    this.combo = new JComboBox();
    JPanel panel = new JPanel();
    panel.add(this.combo);
    
    add(panel);
    setSize(300, 200);
    setVisible(true);
    setDefaultCloseOperation(3);
  }
  
  public void conectaControlador(Controlador c)
  {
    this.combo.addActionListener(c);
    this.combo.setActionCommand("COMBO");
    this.combo.setSelectedIndex(0);
    this.combo.setMaximumRowCount(5);
  }
}
