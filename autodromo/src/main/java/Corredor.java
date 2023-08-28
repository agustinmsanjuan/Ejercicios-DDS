import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Corredor")
public class Corredor extends Personal{
    public Corredor(){

    }
    public Corredor(String nombre, String apellido, LocalDate fechaNac, double peso) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNac(fechaNac);
        this.peso = peso;
    }

    @Override
    public void registrar() {
        //TODO
    }
}
