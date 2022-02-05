package ifam.frameworks.ramonsilva;

import ifam.frameworks.ramonsilva.dao.ConsultarJPA;
import ifam.frameworks.ramonsilva.model.Pais;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static ifam.frameworks.ramonsilva.dao.ConsultarJPA.*;
import static ifam.frameworks.ramonsilva.dao.InserirJPA.inserirEstado;
import static ifam.frameworks.ramonsilva.dao.InserirJPA.inserirPais;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class Main {

    public static void main(String[] args) {
        execucaoOpcao();
        JOptionPane.showConfirmDialog(null,"ESTAMOS ON LINE");
    }


    public static void execucaoOpcao(){
        System.out.println("SEJA BEM VINDO AO PetIsLife \n");
        System.out.println("Escolha a opção de deseja cadastrar \n\n");
        System.out.println("1 - Pais");
        System.out.println("2 - Estado");
        System.out.println("3 - Cidade");
        System.out.println("4 - Pessoa");
        System.out.println("5 - Especie");
        System.out.println("6 - Raça");
        System.out.println("7 - Pet");
        System.out.println("0 - Encerrar");
        Scanner opcao = new Scanner(System.in);
        chamadaCadastro(opcao.nextInt());
    }

    public static void chamadaCadastro(int n) {
        switch (n) {
            case 0:
                System.out.println("Finalizado!");
            case 1:
                entradaPais();
                break;
            case 2:
                entradaEstado();
                break;
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
            default:execucaoOpcao();
       }
       execucaoOpcao();
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
        List<Pais> paisList = new ArrayList<Pais>(consultarPaisList());
        System.out.println("Escolha o  ISO país que deseja cadastra o estado/territorio/Provincia: ");
        imprimirListaPais(paisList);
        Scanner leitura = new Scanner(System.in);
        String isodopais = leitura.nextLine();
        Pais pais = null;
        for(Pais p:paisList){
            if(p.getCodidoISO()==isodopais){
                pais = p;
            }
        }

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
}
