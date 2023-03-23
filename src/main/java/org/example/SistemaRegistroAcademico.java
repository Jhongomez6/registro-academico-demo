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

  //COMO CALCULAMOS EL SALARIO CON BUENAS PRACTICAS DE SOFTWARE.


  //ABIERTO A MODIFICACIONES  -----<> OPEN:CLOSE DICE QUE DEBE SER CERRADO A MODIFICACIONES.
  //ABIERTO A EXTENSION.
  //INTERFACES VS CLASES ABSTRACTAS.
  //

  public int calcularSalario(String tipoDePersona){
    int salario = 0;
    if(tipoDePersona.equals("MAESTRO")){
      //CALCULAMOS SALARIO PARA EL MAESTRO
    } else if(tipoDePersona.equals("COLABORADOR")){
      //CALCULAMOS AQUI EL SALARIO PARA EL COLABORADOR
    } else if(tipoDePersona.equals("TERCEROS")){
      //CALCULAMOS AQUI EL SALARIO PARA LOS TERCEROS.
    }
    return salario;
  }
}
