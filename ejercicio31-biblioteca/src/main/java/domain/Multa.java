package domain;

import java.time.LocalDateTime;

public class Multa {

  private LocalDateTime fechaFinalizacionMulta;
  private LocalDateTime fechaAplicadaMulta;

  public LocalDateTime getFechaFinalizacionMulta() {
    return fechaFinalizacionMulta;
  }

  public Multa(LocalDateTime fechaAplicadaMulta, long diasMultado) {
    this.fechaAplicadaMulta = fechaAplicadaMulta;
    this.fechaFinalizacionMulta = fechaAplicadaMulta.plusDays(diasMultado);
  }

  public void actualizarMulta(LocalDateTime nuevaFechaFinalizacionMulta) {
    if(nuevaFechaFinalizacionMulta.isAfter(fechaFinalizacionMulta)){
      fechaFinalizacionMulta = nuevaFechaFinalizacionMulta;
    }
  }

  public boolean estaActiva() {
    return fechaFinalizacionMulta.isBefore(LocalDateTime.now());
  }
}
