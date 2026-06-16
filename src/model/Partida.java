package model;

public class Partida {
    private Selecao mandante;
    private Selecao visitante;
    private int golsA;
    private int golsB;

    public Partida(Selecao mandante, Selecao visitante, int golsA, int golsB) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsA = golsA;
        this.golsB = golsB;
    }

    public Selecao getMandante() {
        return mandante;
    }

    public void setMandante(Selecao mandante) {
        this.mandante = mandante;
    }

    public Selecao getVisitante() {
        return visitante;
    }

    public void setVisitante(Selecao visitante) {
        this.visitante = visitante;
    }

    public int getGolsA() {
        return golsA;
    }

    public void setGolsA(int golsA) {
        this.golsA = golsA;
    }

    public int getGolsB() {
        return golsB;
    }

    public void setGolsB(int golsB) {
        this.golsB = golsB;
    }
    
    @Override
    public String toString() {
        return "Partida{" +
                "mandante=" + mandante +
                ", visitante=" + visitante +
                ", golsA=" + golsA +
                ", golsB=" + golsB +
                '}';
    }
}
