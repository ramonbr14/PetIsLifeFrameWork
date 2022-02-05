package ifam.frameworks.ramonsilva.dao;

import ifam.frameworks.ramonsilva.model.Pais;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ConsultarJPA {
    public static EntityManager entityConsultar = JPAUtil.getEntityManager();

    public static List<Pais> consultarPaisList(){
        entityConsultar.getTransaction().begin();
        Query query = entityConsultar.createQuery("select p from Pais p");
        int i=0;
        List<Pais> pais = query.getResultList();

        return pais;
    }

    public static void imprimirListaPais(List<Pais> lista){
        for(Pais p:lista){
            System.out.print(p.getCodidoISO()+" - "+p.getNome()+" | ");
            if( p.getId()%3 == 0) {
                System.out.println("");
            }
        }
        System.out.print("CODIGO ISO: ");
    }

    public static Pais escolherPais(String isodopais){
        Pais pais = null;
        return pais;
    }
}
