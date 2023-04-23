package domain;

import java.util.List;

public class Biblioteca {
  private static Biblioteca biblioteca = null;
  private List<Copia> copias;

  public static Biblioteca getInstance(){
    if(biblioteca == null){
      biblioteca = new Biblioteca();
    }
    return biblioteca;
  }
}
