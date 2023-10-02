package maratona.java.javacore.Kenum.Dominio;

public  enum TipodePagamento{
        DEBITO{
            @Override
            public double calculardesconto(double valor) {
                return valor *0.1;
            }
        },CREDITO{
        @Override
        public double calculardesconto(double valor) {
            return valor *0.05;
        }
    };

//metodo abstrasto nao deve ter corpo somente para transcrever
    public abstract double calculardesconto(double valor);





    }

