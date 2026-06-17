import java.util.List;
import java.util.Scanner;

import service.Copa;
import util.CargaInicial;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Copa copa = new Copa();
        CargaInicial.carregar(copa);

        int opcaoEscolhida;

        do {
            System.out.println("\n=== Copa GC — Menu Principal ===");
            System.out.println("1. Listar selecoes por grupo");
            System.out.println("2. Registrar resultado de partida");
            System.out.println("3. Exibir classificacao do grupo");
            System.out.println("4. Listar artilheiros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {

                case 1:
                    System.out.println("Função ainda não implementada");
                    break;
                case 2:
                    System.out.println("Função ainda não implementada");
                    break;
                case 3:
                    System.out.println("Função ainda não implementada");
                    break;
                case 4:
                    System.out.println("Função ainda não implementada");
                    break;
                case 0:
                    System.out.println("Saindo da aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcaoEscolhida != 0);

        scanner.close();
    }
}