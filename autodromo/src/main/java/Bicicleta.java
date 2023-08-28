import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("Bicicleta")
public class Bicicleta extends Vehiculo{
    private int rodado;

    public Bicicleta(){

    }

    public Bicicleta(String marca, String modelo, Double peso, int rodado) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPeso(peso);
        this.rodado = rodado;
    }
}
