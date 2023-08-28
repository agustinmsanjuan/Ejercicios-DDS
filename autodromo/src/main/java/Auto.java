import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Auto")
public class Auto extends Vehiculo {

    public Auto(){

    }


    public Auto(String marca, String modelo, Double peso) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPeso(peso);
    }

}
