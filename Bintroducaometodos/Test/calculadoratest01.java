package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Calculadora;

public class calculadoratest01 {
    public static void main(String[] args) {
        //metodo

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println(calculadora);


        calculadora.substraiaDoisNumeros();
    }

}
