package maratona.java.javacore.Gassociacao.Test;

import maratona.java.javacore.Gassociacao.dominio.Jogador;
import maratona.java.javacore.Gassociacao.dominio.Time;

public class Jogadortime03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores ={ jogador,jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Jogadores ----");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("----Time----");

        time.imprime();

    }
}
