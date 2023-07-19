package maratona.java.javacore.Bintroducaometodos.Dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    public void substraiaDoisNumeros(){
        System.out.println(15 - 5 );
    }

    public void multiplicaDoisNumeros (int num1 , int num2){
        System.out.println(num1 * num2);
    }

    public double dividaDoisNumeros (double num1 , double num2){
        if (num2 == 0){
            System.out.println("Numero nao divisivel ");
            return 0;
        }
        return num1/num2;

    }
    public void alteraDoisNumeros (int num1 , int num2){
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do alteradoisnumeros");
        System.out.println("num 1  " + num1 );
        System.out.println("num 2  " + num2 );

    }

    public  void somaArrys (int [] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;

        }
        System.out.println(soma);


    }

    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for (int num:numeros
             ) {
            soma += num ;

        }
        System.out.println(soma);
    }
}
