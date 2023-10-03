package maratona.java.javacore.Npolimorfismo.Dominio;

import java.sql.SQLOutput;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO= 0.06;
    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularimposto() {
        System.out.println("Calulando imposto ....");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
