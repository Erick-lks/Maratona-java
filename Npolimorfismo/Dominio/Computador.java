package maratona.java.javacore.Npolimorfismo.Dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO= 0.21;

    public Computador(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularimposto() {
        System.out.println("Calculando imposto do computador ...");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
