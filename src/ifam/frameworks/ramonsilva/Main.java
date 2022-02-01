package ifam.frameworks.ramonsilva;

import javax.swing.*;
import java.util.Scanner;

import static ifam.frameworks.ramonsilva.dao.InserirJPA.inserirEstado;
import static ifam.frameworks.ramonsilva.dao.InserirJPA.inserirPais;

public class Main {

    public static void main(String[] args) {
        execucaoOpcao();
        Scanner opcao = new Scanner(System.in);
        chamadaCadastro(opcao.nextInt());
        JOptionPane.showConfirmDialog(null,"ESTAMOS ON LINE");
    }


    public static void execucaoOpcao(){
        System.out.println("SEJA BEM VINDO AO PetIsLife/n");
        System.out.println("Escolha a opção de deseja cadastrar/n/n");
        System.out.println("1 - Pais/n");
        System.out.println("2 - Estado/n");
        System.out.println("3 - Cidade/n");
        System.out.println("4 - Pessoa/n");
        System.out.println("5 - Especie/n");
        System.out.println("6 - Raça/n");
        System.out.println("7 - Pet/n");
        System.out.println("0 - Encerrar/n");
    }

    public static void chamadaCadastro(int n) {
        switch (n) {
            case 0:
                System.out.println("Finalizado!");
            case 1:
                entradaPais();
            case 2:
                System.out.println("Finalizado!");
            case 3:
                System.out.println("Finalizado!");
            case 4:
                System.out.println("Finalizado!");
            case 5:
                System.out.println("Finalizado!");
            case 6:
                System.out.println("Finalizado!");
            case 7:
                System.out.println("Finalizado!");
            case 8:
                System.out.println("Finalizado!");
            case 9:
                System.out.println("Finalizado!");

        }
    }

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
        System.out.println("Codigo IBGE: ");
        String iso = leitura.nextLine();
        System.out.println("Nome do Estado: ");
        String nome = leitura.nextLine();

        try {
            inserirEstado(iso, nome,); //Falta inserir o parametro estado;
        } catch (Exception e) {
            System.out.println("Erro no cadastro do Pais, Ação não Executada");

        }
}
