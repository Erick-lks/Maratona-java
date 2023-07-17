package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Estudante;
import maratona.java.javacore.Bintroducaometodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
     Estudante estudante01 = new Estudante();
     Estudante estudante02 = new Estudante();
     ImpressoraEstudante imprime = new ImpressoraEstudante();


     estudante01.nome = "Joana";
     estudante01.sexo = 'F';
     estudante01.idade = 24;

     estudante02.nome = "Rafael";
     estudante02.sexo = 'M';
     estudante02.idade = 35;


     imprime.imprimaestudante(estudante01);
        System.out.println("-----------------------");

        imprime.imprimaestudante(estudante02);





    }
}
