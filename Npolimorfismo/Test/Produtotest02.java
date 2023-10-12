package maratona.java.javacore.Npolimorfismo.Test;

import maratona.java.javacore.Npolimorfismo.Dominio.Computador;
import maratona.java.javacore.Npolimorfismo.Dominio.Produto;
import maratona.java.javacore.Npolimorfismo.Dominio.Tomate;

public class Produtotest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7", 3000.0);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularimposto());

        System.out.println("_-------------------_");

        Produto produto1 = new Tomate("Americano", 20.0);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularimposto());


        //quem executa e sempre o objeto





    }
}
