/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glossarioinfo;

import Controller.CCategoria;
import Controller.CUsuario;
import Model.Categoria;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 182120044
 */
public class GlossarioInfo {

    public static final String VERMELHO = "\u001B[31m";
    public static final String RESET = "\u001B[30m";
    public static final String VERDE = "\u001B[32m";
    public static final String AZUL = "	\u001B[36m";
    static Scanner leia = new Scanner(System.in);
    public static  CCategoria cadCategoria = new CCategoria();
    public static  CUsuario cadUsuario = new CUsuario();
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opm = 99;
        do {
            System.out.println(AZUL + "--Glossário de T.I");
            menu();
            opm = leiaNumInt();
            switch (opm) {
                case 1:
                    System.out.println(AZUL + "--Pesquisar Termo--" + RESET);
                    System.out.print("Digite o termo:");
                    String termo = leia.nextLine();
                    pesquisaTermo(termo);
                    break;

                case 2:
                    System.out.println(AZUL + "--Editar Termo--");
                    editarTermo();

                    break;
                default:
                    break;

            }

        } while (opm != 0);

    }

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println(VERMELHO + "Erro" + i.getMessage() + "\n Tente novamente" + RESET);
            leiaNumInt();
        }
        return 420;

    }

    public static void menu() {
        System.out.println(AZUL + " --Glossário de T.I--" + RESET);
        System.out.println("1- Pesquisar termo");
        System.out.println("2- Editar termo");
        System.out.println("0 - Sair");
    }

    private static void pesquisaTermo(String termo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void editarTermo() {
        System.out.println("Digite o termo a ser editado");
        String termo = leia.nextLine();
        for (Categoria Categoria : cadCategoria.getCategoria()) {
            
            
        }
    }

}
