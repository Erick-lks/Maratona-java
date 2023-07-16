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
            return 0;
        }
        return num1/num2;

    }
}
