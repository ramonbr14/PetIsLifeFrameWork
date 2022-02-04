package ifam.frameworks.ramonsilva.dao;

import ifam.frameworks.ramonsilva.model.Pais;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ConsultarJPA {
    public static EntityManager entityConsultar = JPAUtil.getEntityManager();

    public static void consultarPaisList(){
        entityConsultar.getTransaction().begin();
        Query query = entityConsultar.createQuery("select * from Pais");
        List<Pais> pais = query.getResultList();
        for(Pais p:pais){
            for(int i=0;i<5;i++){
                System.out.print(p.getCodidoISO()+" - "+p.getNome()+" | ");
            }
            System.out.println("/n");
        }

    }
}
