package maratona.java.javacore.Npolimorfismo.Service;

import maratona.java.javacore.Npolimorfismo.Dominio.Computador;
import maratona.java.javacore.Npolimorfismo.Dominio.Produto;
import maratona.java.javacore.Npolimorfismo.Dominio.Tomate;

public class CalculadoradeImposto {


    public static void calcularimposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        final double imposto = produto.calcularimposto();
        System.out.println("Produto : " + produto.getNome());
        System.out.println("Valor : " + produto.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
// so vai executar se condição abaixo for verdadeiro
           if (produto instanceof Tomate) {
               Tomate tomate = (Tomate) produto;
               System.out.println(tomate.getDatadeValidade());
           }
    }


}
