package org.example;

import org.example.Persona;

public class Maestro extends Persona implements PersonaConSalario {
  //PROGRAMACION ORIENTADO OBEJTOS -> HERENCIA

  private static final int NUMERO_MAXIMO_DE_CURSOS = 3;

  public Maestro(String nombre, int edad, boolean mayorDeEdad, String clases, String estacionamiento){
    //que nos faltaría aqui?
  }
  private String clases;
  private String estacionamiento;

  protected String propiedadProtegida;

  public static int obtenerNumeroMaximoDeCursos(){
    return NUMERO_MAXIMO_DE_CURSOS;
  }

  @Override
  public int calcularSalario() {
    //IMPLEMENTAOS TODA LA LOGICA DE CALCULAR UN SALARIO PARA UN MAESTRO
    return 0;
  }

  //crear metodos en esta clase maestro para obtener algunas propeidades y tambien modificarlas.
}
