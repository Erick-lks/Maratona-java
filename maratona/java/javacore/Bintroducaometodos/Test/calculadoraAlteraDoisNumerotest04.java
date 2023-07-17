package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Calculadora;

public class calculadoraAlteraDoisNumerotest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;


        calculadora.alteraDoisNumeros(num1 , num2);
        System.out.println("Dentro da CaluladoraAlteraDoisNumeros ");
        System.out.println("num 1  "+ num1);
        System.out.println("num 2  "+ num2);

    }
}
// variavel primmitivo nao altera variavel original atentar
