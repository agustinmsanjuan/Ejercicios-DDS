import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class EquipoDeCompeticion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private List<Corredor> corredores;
    @OneToMany
    private List<Tecnico> tecnicos;
    @OneToMany
    private List<Vehiculo> vehiculos;

    public void xd(){
        System.out.println("xd");
    }
}
