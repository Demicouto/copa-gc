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
}