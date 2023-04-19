package domain;

public class Copia {
  private Libro libro;
  private Estado estado;
  private Integer identificador;

  // usamos este para prestar, devolver, etc.
  public void cambiarEstado(Estado estado) {
    this.estado = estado;
  }


//  public void prestar(){
//    this.estado = Estado.PRESTADO;
//  }
//
//  public void devolver(){
//    this.estado = Estado.BIBLIOTECA;
//  }
}
