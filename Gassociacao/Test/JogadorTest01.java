package maratona.java.javacore.Gassociacao.Test;

import maratona.java.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        Jogador jogador011 = new Jogador("Pele");
        Jogador jogador012 = new Jogador("Romario");
        Jogador jogador013 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador011, jogador012, jogador013};

        for (Jogador jogador01 : jogadores) {
            jogador01.imprime();
        }


    }
}
