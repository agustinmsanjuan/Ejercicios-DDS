import Utils.BDUtils;
import javax.persistence.EntityManager;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);

        em.persist(new Tecnico("Juan", "Perez", LocalDate.of(1990, 1, 1), 80.0, 12345678));
        em.persist(new Auto("Ford", "Fiesta", 1000.0));
        em.persist(new Corredor("Alejiti", "ElRapido", LocalDate.of(1990, 1, 1), 80.0));

        BDUtils.commit(em);
    }

}
