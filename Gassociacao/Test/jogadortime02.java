package maratona.java.javacore.Gassociacao.Test;

import maratona.java.javacore.Gassociacao.dominio.Jogador;
import maratona.java.javacore.Gassociacao.dominio.Time;

public class jogadortime02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        jogador01.setTime(time);
        jogador01.imprime();
    }

    }
