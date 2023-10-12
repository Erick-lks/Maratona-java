package maratona.java.javacore.Npolimorfismo.Dominio;

public class Televisao extends  Produto {
    public static final double IMPOSTO_POR_CENTO= 0.21;

    public Televisao(String nome, Double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularimposto() {
        System.out.println("Calculando imposto da Televisao ...");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
