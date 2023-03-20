package org.example;

public class BusinessException extends Exception  {

  public BusinessException(String mensaje){
    super("Regla de negocio violada: " + mensaje);
  }
}
