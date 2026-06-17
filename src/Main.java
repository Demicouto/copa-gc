import java.util.List;
import java.util.Scanner;

import model.Partida;
import model.Selecao;
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
                    System.out.print("Digite o grupo (A ou B): ");
                    char grupo = scanner.next().toUpperCase().charAt(0);

                    copa.listarGrupo(grupo);

                    break;
                case 2:
                    // Seleção Mandante
                    System.out.print("Código FIFA mandante: ");
                    String codigoFifaMandante = scanner.next().toUpperCase();

                    System.out.print("Gols mandante: ");
                    int golsMandante = scanner.nextInt();

                    Selecao selecaoMandante = copa.getSelecao(codigoFifaMandante);

                    // Seleção Visitante
                    System.out.println("Código FIFA visitante: ");
                    String codigoFifaVisitante = scanner.next().toUpperCase();

                    System.out.print("Gols visitante: ");
                    int golsVisitante = scanner.nextInt();

                    Selecao selecaoVisitante = copa.getSelecao(codigoFifaVisitante);

                    if(selecaoVisitante == null || selecaoMandante == null) {
                        System.out.println("O Código Fifa de alguma das seleções está errada,");
                        break;
                    }

                    Partida partida = new Partida(selecaoMandante, selecaoVisitante, golsMandante, golsVisitante);

                    copa.registrarPartida(partida);
                    System.out.println("Registrado com sucesso");

                    break;
                case 3:
                    System.out.print("Digite o grupo (A ou B): ");
                    char g = scanner.next().toUpperCase().charAt(0);

                    System.out.println("\n=== Classificação Grupo " + g + " ===");

                    List<Selecao> selecoesFiltradas = copa.getSelecoes(g);
                    if(selecoesFiltradas == null) {
                        System.out.println("Erro ao filtrar seleções");
                        break;
                    }

                    for (Selecao s : selecoesFiltradas) {

                        int pontos = 0;

                        for (Partida p : copa.getPartidas()) {

                            // mandante
                            if (p.getMandante().equals(s)) {
                                if (p.getGolsA() > p.getGolsB())
                                    pontos += 3;
                                else if (p.getGolsA() == p.getGolsB())
                                    pontos += 1;
                            }

                            // visitante
                            if (p.getVisitante().equals(s)) {
                                if (p.getGolsB() > p.getGolsA())
                                    pontos += 3;
                                else if (p.getGolsB() == p.getGolsA())
                                    pontos += 1;
                            }
                        }

                        System.out.println(s.getCodigoFIFA() + " - " + pontos + " pts");
                    }

                    break;
                case 4:
                    copa.topArtilheiros();
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