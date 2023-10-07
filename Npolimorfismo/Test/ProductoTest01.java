package maratona.java.javacore.Npolimorfismo.Test;

import maratona.java.javacore.Npolimorfismo.Dominio.Computador;
import maratona.java.javacore.Npolimorfismo.Dominio.Televisao;
import maratona.java.javacore.Npolimorfismo.Dominio.Tomate;
import maratona.java.javacore.Npolimorfismo.Service.CalculadoradeImposto;

public class ProductoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro 5", 6000.0);
        Tomate tomate = new Tomate("Tomate Cereja", 10.0);
        Televisao televisao50 = new Televisao("Samsung 50\" ", 5000.0);

        CalculadoradeImposto.calcularimposto(computador);
        System.out.println("-----------------------------");
        CalculadoradeImposto.calcularimposto(tomate);
        System.out.println("-----------------------------");
        CalculadoradeImposto.calcularimposto(televisao50);


    }
}
