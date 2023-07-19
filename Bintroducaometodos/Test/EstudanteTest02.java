package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Erick";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante.imprime();


    }
}
