package org.example;

import java.util.ArrayList;

public class SistemaRegistroAcademico {

  //registrarAlumno();
  //QUEREMOS DESARROLLAR UN METODO QUE NOS PERMITA REGISTRAR UN ALUMNO.

  public Alumno registrarAlumno(String nombre, String direccion, int edad, boolean esEstudianteActivo, String grupo, ArrayList<Curso> clasesATomar)
      throws BusinessException {
    if(validarString(nombre)){
      throw new BusinessException("El nombre no puede ser nulo ni vacio");
    }
    if(validarString(direccion)){
      throw new BusinessException("La direccion no puede ser nulo ni vacio");
    }

    //A TODO TIPO DE DATO STRING DEBERIAMOS VALIDAR QUE NO SEA UNA CADENA VACIA
    //A TODAS LAS VARIABLES DEBERIAMOS VALIDAR QUE NO SEA = NULL
    //EL NOMBRE NO DEBERÍA TENER CARACTERES ESPECIALES ---> REGEX (?)
    //LA EDAD DEBERÍA SER IGUAL O MAYOR A 10.
    //GRUPO DEBE SER UNA CADENA DE TAMAÑO DOS DE LONGITUD.
    Alumno alumno = new Alumno(nombre, direccion, edad, esEstudianteActivo, grupo, clasesATomar);
    //LLAMAMOS A UN METODO DE BD ---->
    return alumno;
  }

  private boolean validarString(String cadena){
    return cadena == null || cadena.isBlank();
  }
}
