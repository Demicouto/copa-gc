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

        copa.adicionarSelecoes(brasil);
        copa.adicionarSelecoes(escocia);
        copa.adicionarSelecoes(espanha);
        copa.adicionarSelecoes(caboverde);
        copa.adicionarSelecoes(ira);
        copa.adicionarSelecoes(estadosunidos);
        copa.adicionarSelecoes(costadomarfim);
        copa.adicionarSelecoes(tunisia);
    }

}