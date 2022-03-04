package ifam.frameworks.ramonsilva.dao;

import ifam.frameworks.ramonsilva.model.Estado;
import ifam.frameworks.ramonsilva.model.Pais;
import java.util.Scanner;

import static ifam.frameworks.ramonsilva.dao.ConsultarJPA.selecionaEstado;
import static ifam.frameworks.ramonsilva.dao.ConsultarJPA.selecionaPais;
import static ifam.frameworks.ramonsilva.dao.InserirJPA.*;

public class EntradasJPA {

    //Funções de Entrada
    public static void entradaPais() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Codigo ISO: ");
        String iso = leitura.nextLine();
        System.out.println("Nome do Pais: ");
        String nome = leitura.nextLine();

        try {
            inserirPais(iso, nome);
        } catch (Exception e) {
            System.out.println("Erro no cadastro do Pais, Ação não Executada");
        }
    }

    public static void entradaEstado() {
        Scanner leitura = new Scanner(System.in);
        Pais pais = selecionaPais();
        System.out.println("Codigo IBGE: ");
        String codibge = leitura.nextLine();
        System.out.println("Nome do Estado: ");
        String nome = leitura.nextLine();

        try {
            inserirEstado(codibge, nome, pais); //Falta inserir o parametro estado;
        } catch (Exception e) {
            System.out.println("Erro no cadastro do Estado, Ação não Executada");

        }
    }

    public static void entradaCidade() {
        Scanner leitura = new Scanner(System.in);
        Pais pais = selecionaPais();
        Estado estado = selecionaEstado(pais);
        System.out.println("Codigo IBGE Municipal: ");
        String codibge = leitura.nextLine();
        System.out.println("Nome da Cidade: ");
        String nome = leitura.nextLine();

        try {
            inserirCidade(codibge, nome, estado);
        } catch (Exception e) {
            System.out.println("Erro no cadastro da Cidade, Ação não Executada");

        }
    }
    public static void entradaPessoa() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("INSIRA O CPF: ");
        String cpf = leitura.nextLine();
        System.out.print("NOME: ");
        String nome = leitura.nextLine();
        System.out.print("EMAIL: ");
        String email = leitura.nextLine();
        System.out.println("TELEFONE: ");
        String telefone = leitura.nextLine();
        System.out.println("DATA DE NASCIMENTO(DD-MM-AAAA): ");
        String dtn = leitura.nextLine();
        System.out.println("MASCULINO OU FEMININO: ");
        String sexo = leitura.nextLine();
        System.out.println("CUIDADOR OU PROPRIETARIO");
        String tipopessoa = leitura.nextLine();




        try {
            inserirCidade(codibge, nome, estado);
        } catch (Exception e) {
            System.out.println("Erro no cadastro da Cidade, Ação não Executada");

        }
    }
}
