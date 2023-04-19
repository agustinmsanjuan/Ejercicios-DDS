package Domain;

public class Tarjeta {
  public double nroTarjeta;
  private boolean verificada;
  private double montoAPagar;

  public void agregarMonto(double monto){
    if(verificada){
      montoAPagar += monto;
    }
  }

}
