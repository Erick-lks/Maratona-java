package maratona.java.javacore.Npolimorfismo.Test;

import maratona.java.javacore.Npolimorfismo.Dominio.Computador;
import maratona.java.javacore.Npolimorfismo.Dominio.Tomate;
import maratona.java.javacore.Npolimorfismo.Service.CalculadoradeImposto;

public class ProductoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro 5", 6000.0);
        Tomate tomate = new Tomate("Tomate Cereja", 10.0);

        CalculadoradeImposto.calcularimpostocomputador(computador);
        System.out.println("-----------------------------");
        CalculadoradeImposto.calcularimpostoTomate(tomate);
        System.out.println("-----------------------------");



    }
}
