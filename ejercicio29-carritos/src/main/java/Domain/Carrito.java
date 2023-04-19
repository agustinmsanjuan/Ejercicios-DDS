package Domain;

import java.util.List;
import java.util.stream.Collectors;

public class Carrito {
  private List<Item> items;

  public void agregarItem(Producto producto, int cantidad){
    items.add(new Item(producto, cantidad));
  }

  public void sacarItem(Producto producto){
    int indice = items.stream().map(i-> i.getProducto()).collect(Collectors.toList()).indexOf(producto);
    items.remove(indice);
  }
  public double comprar(){
    items.forEach(i->i.setValor(i.getProducto().getValor()));
    return items.stream().mapToDouble(i->i.getValor()).sum();
  }
}
