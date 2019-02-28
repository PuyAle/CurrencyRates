package currencydao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class MyEntityManager {

    public MyEntityManager() {
    }

    private static volatile EntityManagerFactory emf;

    synchronized public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("puyaschoolprojects_RestClientCurrency_war_1.0-SNAPSHOTPU");
        }
        return emf.createEntityManager();

    }

    synchronized public static void close() {
        if (emf != null) {
            emf.close();
        }
    }

}
