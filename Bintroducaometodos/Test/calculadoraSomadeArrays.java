package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Calculadora;

public class calculadoraSomadeArrays {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] numeros = {1,2,3,4,5};

        calculadora.somaArrys(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8);

    }
}
//somaVarArgs vacilidade de utilização porem nao pode ter outro tipo de atributo
