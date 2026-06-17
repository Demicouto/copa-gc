package util;
import model.Partida;
import model.Selecao;
import service.Copa;

public class CargaInicial {
    public static void carregar(Copa copa){
        //GRUPO A
        Selecao brasil= new Selecao("Brasil", 'A', "BRA");
        Selecao escocia= new Selecao("Escócia", 'A', "ESC");
        Selecao espanha= new Selecao("Espanha", 'A', "ESP");
        Selecao caboverde= new Selecao("Cabo verde", 'A', "CAB");

        //GRUPO B
        Selecao ira = new Selecao("Irã", 'B', "IRN");
        Selecao estadosunidos = new Selecao("Estados Unidos", 'B', "USA");
        Selecao costadomarfim = new Selecao("Costa do Marfim",'B', "CDM");
        Selecao tunisia = new Selecao("Tunísia", 'B', "TUN");

        copa.adicionarSelecao(brasil);
        copa.adicionarSelecao(escocia);
        copa.adicionarSelecao(espanha);
        copa.adicionarSelecao(caboverde);
        copa.adicionarSelecao(ira);
        copa.adicionarSelecao(estadosunidos);
        copa.adicionarSelecao(costadomarfim);
        copa.adicionarSelecao(tunisia);

        //Partidas
        copa.registrarPartida(new Partida(brasil,tunisia, 2, 0));
        copa.registrarPartida(new Partida(ira ,estadosunidos, 7, 7));
        copa.registrarPartida(new Partida(espanha,caboverde, 0, 0));
        copa.registrarPartida(new Partida(costadomarfim, escocia, 1, 7));
    }

}