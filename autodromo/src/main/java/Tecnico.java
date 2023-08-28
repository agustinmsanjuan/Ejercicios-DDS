import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Tecnico")
@Getter
public class Tecnico extends Personal{
  private Integer dni;

    public Tecnico(){

    }
    public Tecnico(String nombre, String apellido, LocalDate fechaNac, double peso, Integer dni) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNac(fechaNac);
        this.peso = peso;
        this.dni = dni;
    }

    @Override
public void registrar() {
    //TODO
}


}
