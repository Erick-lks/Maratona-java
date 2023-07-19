package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Calculadora;

public class calculadoraDvisaotest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividaDoisNumeros(20.5 , 10.0);
        System.out.println(result);

    }
}
// caso precise retornar um int deve se fazer um cast (int)