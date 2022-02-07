package ifam.frameworks.ramonsilva.util;


import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class JPAUtil {

    private static EntityManagerFactory factory =
            createEntityManagerFactory("JPApet");

    public static EntityManager getEntityManager(){

        return factory.createEntityManager();

    }

}