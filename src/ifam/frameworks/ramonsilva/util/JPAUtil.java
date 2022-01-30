package ifam.frameworks.ramonsilva.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class JPAUtil {

    private static EntityManagerFactory factory =
            createEntityManagerFactory("JPApet");

    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }

}

