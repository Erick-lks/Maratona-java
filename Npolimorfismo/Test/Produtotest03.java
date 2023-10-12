package maratona.java.javacore.Npolimorfismo.Test;

import maratona.java.javacore.Npolimorfismo.Dominio.Computador;
import maratona.java.javacore.Npolimorfismo.Dominio.Produto;
import maratona.java.javacore.Npolimorfismo.Dominio.Tomate;
import maratona.java.javacore.Npolimorfismo.Service.CalculadoradeImposto;

public class Produtotest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Rzen 9", 7000.0);

      Tomate tomate = new Tomate("Americano" , 20.0);

      tomate.setDatadeValidade("07/10/2023");


        CalculadoradeImposto.calcularimposto(tomate);
        CalculadoradeImposto.calcularimposto(produto);
    }
}
