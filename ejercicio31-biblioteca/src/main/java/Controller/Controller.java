package Controller;
import domain.Prestamo;

public class Controller {
  public void obtenerMulta(Prestamo prestamo) {
    prestamo.finalizarPrestamo();
    if(prestamo.getLector().tieneMulta()){
      System.out.println("Se asignó la multa hasta " + prestamo.getLector().getMulta().getFechaFinalizacionMulta().toString());
    }
  }
}
