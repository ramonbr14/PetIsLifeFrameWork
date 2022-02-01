package ifam.frameworks.ramonsilva.dao;


import ifam.frameworks.ramonsilva.model.*;
import ifam.frameworks.ramonsilva.util.JPAUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class InserirJPA {

    public static EntityManager entityInserir = JPAUtil.getEntityManager();

    public static void inserirPais(String codigoiso,String nome){
        entityInserir.getTransaction().begin();
        Pais pais = new Pais();
        pais.setNome(nome);
        pais.setCodidoISO(codigoiso);

        entityInserir.persist(pais);
        entityInserir.getTransaction().commit();
    }

    public static void inserirEstado(String codigoIbge,String nome, Pais pais){
        entityInserir.getTransaction().begin();
        Estado estado = new Estado();
        estado.setCodigoIBGE(codigoIbge);
        estado.setNome(nome);
        estado.setPais(pais);

        entityInserir.persist(estado);
        entityInserir.getTransaction().commit();
    }
    //Continuar criando os metodos de Inserir
    public static void inserirCidade(String codigoIbge,String nome,Estado estado){
        entityInserir.getTransaction().begin();
        Cidade cidade = new Cidade();

        cidade.setCodigoIBGE(codigoIbge);
        cidade.setNome(nome);
        cidade.setEstado(estado);

       entityInserir.persist(cidade);
       entityInserir.getTransaction().commit();
    }

    public static void inserirPessoa(String doc,String nome, String endereco, Cidade cidade, String email, String telefone, String dtnascimento, SexoPessoaENUM sexo, PessoaENUM tipo){
        entityInserir.getTransaction().begin();
        LocalDateTime date = LocalDateTime.parse(dtnascimento);
        Pessoa pessoa = new Pessoa(doc,nome,telefone,endereco,email,cidade,sexo,tipo,date);

        entityInserir.persist(pessoa);
        entityInserir.getTransaction().commit();
    }

    public static void inserirEspecie(String nome){
        entityInserir.getTransaction().begin();
        Especie especie = new Especie(nome);

        entityInserir.persist(especie);
        entityInserir.getTransaction().commit();
    }

    public static void inserirRaca(String nome, Especie especie){
        entityInserir.getTransaction().begin();
        Raca raca = new Raca(nome,especie);

        entityInserir.persist(raca);
        entityInserir.getTransaction().commit();
    }

    public static void inserirPet(String nome,String dtnascimento, SexoPetENUM sexo, Raca raca, Pessoa pessoa){
        entityInserir.getTransaction().begin();
        LocalDateTime data = LocalDateTime.parse(dtnascimento);
        Pet pet = new Pet(nome,data,sexo,raca,pessoa);

        entityInserir.persist(pet);
        entityInserir.getTransaction().commit();
    }

}
