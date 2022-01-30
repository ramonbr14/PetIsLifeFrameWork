package ifam.frameworks.ramonsilva.dao;


import ifam.frameworks.ramonsilva.model.*;
import ifam.frameworks.ramonsilva.util.JPAUtil;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class InserirJPA {

    static EntityManager entityInserir = JPAUtil.getEntityManager();

    public static void inserirPais(String codigoiso,String nome){
        Pais pais = new Pais();
        pais.setNome(nome);
        pais.setCodidoISO(codigoiso);

        entityInserir.persist(pais);
    }

    public static void inserirEstado(String codigoIbge,String nome, Pais pais){
        Estado estado = new Estado();
        estado.setCodigoIBGE(codigoIbge);
        estado.setNome(nome);
        estado.setPais(pais);

        entityInserir.persist(estado);
    }
    //Continuar criando os metodos de Inserir
    public static void inserirCidade(String codigoIbge,String nome,Estado estado){
        Cidade cidade = new Cidade();

        cidade.setCodigoIBGE(codigoIbge);
        cidade.setNome(nome);
        cidade.setEstado(estado);

       entityInserir.persist(cidade);
    }

    public static void inserirPessoa(String doc,String nome, String endereco, Cidade cidade, String email, String telefone, String dtnascimento, SexoPessoaENUM sexo, PessoaENUM tipo){
        LocalDateTime date = LocalDateTime.parse(dtnascimento);
        Pessoa pessoa = new Pessoa(doc,nome,telefone,endereco,email,cidade,sexo,tipo,date);

        entityInserir.persist(pessoa);
    }

    public static void inserirEspecie(String nome){
        Especie especie = new Especie(nome);

        entityInserir.persist(especie);
    }

    public static void inserirRaca(String nome, Especie especie){
        Raca raca = new Raca(nome,especie);

        entityInserir.persist(raca);
    }

    public static void inserirPet(String nome,String dtnascimento, SexoPetENUM sexo, Raca raca, Pessoa pessoa){
        LocalDateTime data = LocalDateTime.parse(dtnascimento);
        Pet pet = new Pet(nome,data,sexo,raca,pessoa);
    }

}
