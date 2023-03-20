package org.example;

import java.util.ArrayList;
import java.util.List;

class Main {
  // ANNOTATIONS (HERENCIA, ABSTRACTION, POLI) <--> SOLID
  // LIST, SET, MAP  ||   PILAS <---> COLAS
  public static void main(String args[]) throws BusinessException {
    ArrayList<Curso> listaCursos = new ArrayList<>();
    Curso curso = new Curso(10);
    listaCursos.add(curso);
    SistemaRegistroAcademico sistemaRegistroAcademico = new SistemaRegistroAcademico();
    sistemaRegistroAcademico.registrarAlumno(null, "Calle 10", 18, true, "BETA", listaCursos);
  }
}