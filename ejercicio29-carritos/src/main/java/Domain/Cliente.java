package Domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nombre;
  private int DNI;
  private String email;
  private String dirEnvio;
  private String dirCobro;
  private Tarjeta tarjeta;
  private TipoCliente tipoCliente;
  List<Carrito> carritos = new ArrayList<Carrito>();

  public Cliente(String nombre, int DNI, String email, String dirEnvio, String dirCobro, Tarjeta tarjeta, TipoCliente tipoCliente, List<Carrito> carritos) {
    this.nombre = nombre;
    this.DNI = DNI;
    this.email = email;
    this.dirEnvio = dirEnvio;
    this.dirCobro = dirCobro;
    this.tarjeta = tarjeta;
    this.tipoCliente = tipoCliente;
    this.carritos = carritos;
  }

  public void agregarCarrito(Carrito carrito) {
    carritos.add(carrito);
  }

  public void pagarCarrito(Carrito carrito){
    double monto = carrito.comprar() - tipoCliente.aplicarDescuento();
    tarjeta.agregarMonto(monto);
  }
}
