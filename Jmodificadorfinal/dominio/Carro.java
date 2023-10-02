package maratona.java.javacore.Jmodificadorfinal.dominio;

import maratona.java.javacore.Bintroducaometodos.Dominio.Calculadora;

public class Carro {

    private String nome;

    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador comprador = new Comprador();

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
