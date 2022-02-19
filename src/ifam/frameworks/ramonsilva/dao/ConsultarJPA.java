package ifam.frameworks.ramonsilva.dao;

import ifam.frameworks.ramonsilva.model.Estado;
import ifam.frameworks.ramonsilva.model.Pais;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ifam.frameworks.ramonsilva.Main.execucaoOpcao;

public class ConsultarJPA {
    public static EntityManager entityConsultar = JPAUtil.getEntityManager();

    public static List<Pais> consultarPaisList() {
        entityConsultar.getTransaction().begin();
        entityConsultar.getTransaction().commit();
        Query query = entityConsultar.createQuery("select p from Pais p");
        List<Pais> pais = query.getResultList();

        //entityConsultar.close();
        return pais;
    }

    public static void imprimirListaPais(List<Pais> lista) {
        for (Pais p : lista) {
            System.out.print(p.getCodidoISO() + " - " + p.getNome() + " | ");
            if (p.getId() % 3 == 0) {
                System.out.println("");
            }
        }
        System.out.print("CODIGO ISO: ");
    }

    public static Pais selecionaPais() {
        List<Pais> paisList = new ArrayList<Pais>(consultarPaisList());
        System.out.println("Escolha o  ISO país que deseja: ");
        imprimirListaPais(paisList);
        Scanner leitura = new Scanner(System.in);
        String isodopais = leitura.nextLine();
        Pais pais = null;
        for (Pais p : paisList) {
            if ((p.getCodidoISO()).equals(isodopais)) {
                pais = p;
            }
        }
        if (pais.equals(null)) {
            System.out.println("Pais não selecionado!");
            execucaoOpcao();
        }
        return pais;
    }

    public static List<Estado> consultarEstadoList(Pais pais) {
        entityConsultar.getTransaction().begin();
        entityConsultar.getTransaction().commit();
        int cd = pais.getId();
        Query query = entityConsultar.createQuery("select e from Estado e where e.pais.id ="+ cd);//INSERIR O FILTRO DO PAIS AQUI
        List<Estado> estado = query.getResultList();

        /*String hql = "from Produto where preco > :preco";
  Query query = session.createQuery(hql);
  query.setDouble("preco",25.0);
  List results = query.list();*/

        //entityConsultar.close();
        return estado;
    }

    public static void imprimirListaEstado(List<Estado> lista) {
        for (Estado e : lista) {
            System.out.print(e.getCodigoIBGE() + " - " + e.getNome() + " | ");
            if (e.getId() % 4 == 0) {
                System.out.println("");
            }
        }
        System.out.println("CODIGO IBGE: ");
    }

    public static Estado selecionaEstado(Pais pais) {
        List<Estado> estadoList = new ArrayList<Estado>(consultarEstadoList(pais));
        System.out.println("Escolha o codigo do Estado: ");
        imprimirListaEstado(estadoList);
        Scanner leitura = new Scanner(System.in);
        String codigoibge = leitura.nextLine();
        Estado estado = null;
        for (Estado e : estadoList) {
            if (e.getCodigoIBGE().equals(codigoibge)) {
                estado = e;
            }
        }
        if (estado.equals(null)) {
            System.out.println("Estado não selecionado!");
            execucaoOpcao();
        }
        return estado;
    }
}