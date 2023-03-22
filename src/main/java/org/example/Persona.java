package org.example;

public abstract class Persona {

  //ENCAPSULAMIENTO
  public static final int EDAD_PARA_MAYOR_EDAD = 18;

  //protected boolean mayorDeEdad;
  protected int edad;
  protected String nombre;
  protected String direccion;

  public abstract int calcularSalario();

  //NECESITO UN METODO QUE VERIFIQUE SI UNA PERSONA ES MAYOR DE EDAD O NO
  //el metodo debe retonar un boolean true si la persona mayor de edad y false si no lo es.

  public boolean verificarMayorDeEdad(){
    boolean mayorDeEdad = false;
    if(edad >= EDAD_PARA_MAYOR_EDAD){
      mayorDeEdad = true;
    }
    return mayorDeEdad;
  }
}
