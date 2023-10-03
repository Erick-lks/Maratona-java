package maratona.java.javacore.Npolimorfismo.Service;

import maratona.java.javacore.Npolimorfismo.Dominio.Computador;
import maratona.java.javacore.Npolimorfismo.Dominio.Tomate;

public class CalculadoradeImposto {

    public static void calcularimpostocomputador (Computador computador){
        System.out.println("Relatorio de imposto do computador");
        final double impostocomputador = computador.calcularimposto();
        System.out.println("Computador : " + computador.getNome());
        System.out.println("Valor : " + computador.getValor());
        System.out.println("Imposto do computador : " + impostocomputador);
    }

    public static void calcularimpostoTomate (Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        final double impostotomate = tomate.calcularimposto();
        System.out.println("tomate : " + tomate.getNome());
        System.out.println("Valor : " + tomate.getValor());
        System.out.println("Imposto do tomate : " + impostotomate);
    }



}
