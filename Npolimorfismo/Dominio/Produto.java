package maratona.java.javacore.Npolimorfismo.Dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
