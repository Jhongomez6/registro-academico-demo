package org.example;

import java.util.ArrayList;

public class Alumno extends Persona {

  //PROPIEDADES
  private String grupo;

  private ArrayList<Curso> clasesATomar;

  private boolean esEstudianteActivo;


  //CONSTRUCTOR
  public Alumno(String nombre, String direccion, int edad, boolean esEstudianteActivo, String grupo, ArrayList<Curso> clasesATomar){
    super.nombre = nombre;
    super.edad = edad;
    super.direccion = direccion;
    this.esEstudianteActivo = esEstudianteActivo;
    this.clasesATomar = clasesATomar;
    this.grupo = grupo;
  }

  //SOBRECARGAR UN METODO ES ESCRIBIRLO CON EL MISMO NOMBRE PERO DIFERENTE CANTIDAD DE ATRIBUTOS O TIPO DE ATRIBUTOS.
  public Alumno(String nombre, String grupo){
    super.nombre = nombre;
    this.grupo = grupo;
  }

  //METODOS
  public String obtenerGrupo(){
    return grupo;
  }

  public void modificarGrupo(String grupoNuevo){
    this.grupo = grupoNuevo;
  }

  public void modificarDireccion(String nuevaDireccion){
    super.direccion = nuevaDireccion;
  }
/*
  public boolean esMayorEdad(){
    return super.mayorDeEdad;
  }*/



}
