package Vista;

import Control.Controlador;

public class RUN
{
  public static void main(String[] args)
  {
    Vista v = new Vista();
    Controlador cont = new Controlador(v);
    v.conectaControlador(cont);
  }
}