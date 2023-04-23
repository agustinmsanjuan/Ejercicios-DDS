package domain;

import java.time.LocalDateTime;
import java.util.List;

public class Lector {
  private Multa multa;
  private List<Prestamo> prestamos;
  private List<Prestamo> historialDePrestamos;
  private boolean habilitado = true;

  public boolean cumpleCantidadPrestamos() {
    return cantidadPrestamosActivos() <= 3;
  }

  public boolean puedePedirPrestamo() {
    return cumpleCantidadPrestamos() && !tieneMulta() && habilitado;
  }

  private int cantidadPrestamosActivos() {
    return prestamos.size();
  }

  public boolean tieneMulta() {
    return multa.estaActiva();
  }

  public void agregarPrestamo(Prestamo prestamo) {
    prestamos.add(prestamo);
  }

  public void setHabilitado(boolean habilitado) {
    this.habilitado = habilitado;
  }

  public void aplicarMulta(LocalDateTime diaDevolucion, long dias) {
    if (validarMulta()) {
      this.multa.actualizarMulta(diaDevolucion.plusDays(dias));
    }else{
      Multa nuevaMulta = new Multa(diaDevolucion, dias);
      this.multa = nuevaMulta;
    }
  }

  private boolean validarMulta() {
    return this.multa != null;
  }

}
