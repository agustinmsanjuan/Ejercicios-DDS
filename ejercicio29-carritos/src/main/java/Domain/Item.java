package Domain;

public class Item {
  private Producto producto;
  private int cantidad;
  private double valor;

  public Item(Producto producto, int cantidad){
    this.producto = producto;
    this.cantidad = cantidad;
    this.valor = producto.getValor();
  }

  public Producto getProducto(){
    return this.producto;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }
}
