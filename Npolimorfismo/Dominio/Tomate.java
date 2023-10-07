package maratona.java.javacore.Npolimorfismo.Dominio;

import java.sql.SQLOutput;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO= 0.06;
    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }
    private String datadeValidade;

    @Override
    public double calcularimposto() {
        System.out.println("Calulando imposto ....");
        return this.valor * IMPOSTO_POR_CENTO;
    }



    public Tomate(String nome, Double valor, String datadeValidade) {
        super(nome, valor);
        this.datadeValidade = datadeValidade;
    }

    public String getDatadeValidade() {
        return datadeValidade;
    }

    public void setDatadeValidade(String datadeValidade) {
        this.datadeValidade = datadeValidade;
    }
}
