package Modelo;

public class Dispositivo
{
  public int id;
  public String nombre;
  public float precio;
  
  public Dispositivo() {}
  
  public Dispositivo(int id, String nombre, float precio)
  {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getNombre()
  {
    return this.nombre;
  }
  
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  
  public float getPrecio()
  {
    return this.precio;
  }
  
  public void setPrecio(float precio)
  {
    this.precio = precio;
  }
}
