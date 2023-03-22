package org.example;

import java.util.ArrayList;
import java.util.List;

class Main {
  // ANNOTATIONS (HERENCIA, ABSTRACTION, POLI) <--> SOLID
  // LIST, SET, MAP  ||   PILAS <---> COLAS
  // NO REIVENTAR LA RUEDA.
  //MANTENIBLE, REUSABLE, LEGIBLE, EXTENDIBLE,
  public static void main(String args[]) throws BusinessException {
    ArrayList<Curso> listaCursos = new ArrayList<>();
    Curso curso = new Curso(10);
    listaCursos.add(curso);
    SistemaRegistroAcademico sistemaRegistroAcademico = new SistemaRegistroAcademico();
    sistemaRegistroAcademico.registrarAlumno(null, "Calle 10", 18, true, "BETA", listaCursos);
  }

  //S O L I D
  // S : Single Responsability = Responsabilidad Unica (Cada clase, componente o funcion tenga una unica responsabilidad u objetivo)
  // O: Open-close -> Abierto-cerrado (Abierto a extension, es decir que yo pueda extender funcionalidades de mi sistema. Y cerrado a modificaciones,
  // es decir que cuando yo deba crear una funcionalidad no debería modificarla si no extenderla.
  // L: Liskov susbtitution -> Substitucion de liskov
  // I: Interface seggregation -> Segregación de interfaces.
  // D: Dependency inversion -> Inversion de dependencias.

}