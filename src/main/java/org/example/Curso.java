package org.example;

public class Curso {
  //ENCAPSULAMIENTO
  private int codigo;
  private int duracion;
  private String nombre;
  private String descripcion;
  private String contenido;
  private String horario;

  //EL CONSTRUCTOR ES UN BLOQUE DE CODIGO QUE NOS PERMITE ASIGNAR LOS VALORES DE LOS OBJETOS DE ACUERDO DE LAS PROPIEDADES DEFINIDAS EN MI CLASE.
  public Curso(int codigo, int duracion, String nombre, String descripcion, String contenido, String horario){
    this.codigo = codigo;
    this.duracion = duracion;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.contenido = contenido;
    this.horario = horario;
  }

  public Curso(int codigo){
    this.codigo = codigo;
  }

  public String obtenerNombre(){
    return nombre;
  }

  public int obtenerDuracion(){
    return duracion;
  }
}
