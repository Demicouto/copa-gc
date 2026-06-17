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
}