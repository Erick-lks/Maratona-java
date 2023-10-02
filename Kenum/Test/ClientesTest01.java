package maratona.java.javacore.Kenum.Test;

import maratona.java.javacore.Kenum.Dominio.Cliente;
import maratona.java.javacore.Kenum.Dominio.TipoCliente;
import maratona.java.javacore.Kenum.Dominio.TipodePagamento;

public class ClientesTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jhonatahan",TipoCliente.PESSOA_JURIDICA, TipodePagamento.DEBITO);
        Cliente cliente2 = new Cliente("Joao", TipoCliente.PESSOA_FISICA, TipodePagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipodePagamento.DEBITO.calculardesconto(120));
        System.out.println(TipodePagamento.CREDITO.calculardesconto(120));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2= TipoCliente.tipoClientepornomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);


    }
}

