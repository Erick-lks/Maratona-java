package maratona.java.javacore.Kenum.Dominio;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2 , "Pessoa Juridica");
   public final int VALOR;

private final String nomeRelatorio;
    TipoCliente(int valor , String nomeRelatorio) {
        this.VALOR= valor;
        this.nomeRelatorio = nomeRelatorio;


    }


    public static  TipoCliente tipoClientepornomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio(tipoCliente).equals(nomeRelatorio)){
                return tipoCliente;

            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio(TipoCliente tipoCliente) {
        return nomeRelatorio;
    }
}
