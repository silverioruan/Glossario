/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glossarioinfo;

import Conexao.DatabaseSearch;
import Controller.CCategoria;
import Controller.CUsuario;
import Model.Categoria;
import Model.Usuario;
import java.util.InputMismatchException;
import java.util.List;
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
    public static CCategoria cadCategoria = new CCategoria();
    public static CUsuario cadUsuario = new CUsuario();

    public static void Login() {
        System.out.print("Digite o nome de usuário: ");
        String username = leia.nextLine();

        System.out.print("Digite a senha: ");
        String password = leia.nextLine();

        Usuario usuarioAutenticado = Validadores.Login.autenticar(username, password);

        if (usuarioAutenticado != null) {
            if (usuarioAutenticado.getNivelAcesso().equals("administrador")) {
                System.out.println("Login de administrador bem-sucedido!");
                // Lógica para o nível de acesso do administrador
            } else if (usuarioAutenticado.getNivelAcesso().equals("usuario")) {
                System.out.println("Login de usuário comum bem");
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opm = 99;
        System.out.println("Sistema de Glossario de TI");
        do {
            System.out.println(AZUL + "--Glossário de T.I");
            
            menuuser();
            System.out.print("--Digite Aqui--");
            opm = leiaNumInt();
            switch (opm) {
                case 1:
                    System.out.println(AZUL + "--Pesquisar Termo--" + RESET);
                    pesquisaTermo();
                    break;

                case 2:
                    Login();
                    do {
                        menuadmin();
                        opm = leia.nextInt();
                        switch (opm) {
                            case 1:
                                //editarTermo();
                                break;
                            case 2:
                                //deletarTermo();
                                break;

                            case 0:
                                break;
                            default:
                                System.out.print(VERMELHO + "Opção inválida" + RESET);

                        }
                    } while (opm != 0);

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

    public static void menuadmin() {
        System.out.println(AZUL + " --Glossário de T.I--" + RESET);
        System.out.println("1- Editar termo");
        System.out.println("2- Deletar termo");
        System.out.println("0 - Sair");
    }

    public static void menuuser() {
        System.out.println(AZUL + " --Glossário de T.I--" + RESET);
        System.out.println("1- Pesquisar termo");
        System.out.println("2 - Login");
        System.out.println("0 - Sair");
    }

    private static void pesquisaTermo() {

        System.out.print("Digite a palavra-chave para busca: ");
        String keyword = leia.nextLine();

        DatabaseSearch databaseSearch = new DatabaseSearch();
        List<String> results = databaseSearch.searchByKeyword(keyword);

        if (results.isEmpty()) {
            System.out.println("Nenhum resultado encontrado.");
        } else {
            System.out.println("Resultados encontrados:");
            for (String result : results) {
                System.out.println(result);
            }
        }

        
    }
/*
    private static void editarTermo() {
        System.out.println("Digite o termo a ser editado");
        String termo = leia.nextLine();
        for (Categoria Categoria : cadCategoria.getCategoria()) {

        }
    }

    private static void deletarTermo() {

        System.out.println("Digite o termo a ser deletado:");
        String termo = leia.nextLine();

    }
*/
}
