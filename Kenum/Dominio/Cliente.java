package maratona.java.javacore.Kenum.Dominio;

public class Cliente{
    private String nome;
    private TipoCliente tipoCliente;

    private TipodePagamento tipodePagamento;



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio(tipoCliente) +
                ", tipoClienteint=" + tipoCliente.getVALOR() +
                ", tipodePagamento=" + tipodePagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipodePagamento tipodePagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipodePagamento = tipodePagamento;
    }
}

