import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Karting")
public class Karting extends Vehiculo{
    public Karting(){

    }

    public Karting(String marca, String modelo, Double peso) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPeso(peso);
    }
}
