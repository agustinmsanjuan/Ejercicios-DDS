package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class Prestamo {
  private Copia copia;
  private LocalDateTime fechaRetiro;
  private LocalDateTime fechaDeVencimiento;
  private LocalDateTime fechaDevolucion;
  private Lector lector;

  public Prestamo(Copia copia, LocalDateTime fechaRetiro, LocalDateTime fechaDevolucion, Lector lector) {
    this.copia = copia;
    this.fechaRetiro = fechaRetiro;
    this.fechaDeVencimiento = fechaRetiro.plusDays(30);
    this.fechaDevolucion = fechaDevolucion;
    this.lector = lector;
  }

  public long calcularDiasDeMultas(){
    Duration duration = Duration.between(fechaDeVencimiento, fechaDevolucion);
    return duration.toDays() * 2;
  }

  public void finalizarPrestamo(){
    copia.cambiarEstado(Estado.BIBLIOTECA);
    if(fechaDevolucion.isAfter(fechaDeVencimiento)){
      lector.aplicarMulta(fechaDevolucion, calcularDiasDeMultas());
    }
  }

  // esto se ejecutaría en un cron en la fecha de vencimiento
  public void vencido(){
    copia.cambiarEstado(Estado.RETRASO);
    lector.setHabilitado(false);
  }
}
