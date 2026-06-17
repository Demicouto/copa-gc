package service;

import model.Selecao;
import model.Partida;
import java.util.ArrayList;
import java.util.List;

public class Copa {
    private List<Selecao> selecoes;
    private List<Partida> partidas;
    private List<String> artilheiros;

    public Copa() {
        this.selecoes = new ArrayList<>();
        this.partidas = new ArrayList<>();
        this.artilheiros = new ArrayList<>();
    }

    public void adicionarSelecao(Selecao selecao) {
        this.selecoes.add(selecao);
    }

    public void registrarPartida(Partida partida) {
        this.partidas.add(partida);
    }

    public void listarGrupo(char grupo) {
        System.out.println("=== Grupo " + grupo + " ===");
        for (Selecao s : selecoes) {
            if (s.getGrupo() == grupo) {
                System.out.println(s.toString());
            }
        }
    }

    public void adicionarArtilheiro(String nome) {
        this.artilheiros.add(nome);
    }

    public void topArtilheiros() {
        System.out.println("=== Top Artilheiros ===");
        for (String artilheiro : artilheiros) {
            System.out.println(artilheiro);
        }
    }

    public void calcularClassificacao() {
        System.out.println("=== Classificação da Copa ===");
        
        for (Selecao selecao : selecoes) {
            int pontos = 0;
            
            for (Partida partida : partidas) {
                // Checa se a seleção jogou como mandante
                if (partida.getMandante().getCodigoFIFA().equals(selecao.getCodigoFIFA())) {
                    if (partida.getGolsA() > partida.getGolsB()) pontos += 3;
                    else if (partida.getGolsA() == partida.getGolsB()) pontos += 1;
                } 
                // Checa se a seleção jogou como visitante
                else if (partida.getVisitante().getCodigoFIFA().equals(selecao.getCodigoFIFA())) {
                    if (partida.getGolsB() > partida.getGolsA()) pontos += 3;
                    else if (partida.getGolsB() == partida.getGolsA()) pontos += 1;
                }
            }
            
            System.out.println(selecao.getNome() + " (Grupo " + selecao.getGrupo() + ") - " + pontos + " pontos");
        }
    }
}