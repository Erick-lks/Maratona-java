package maratona.java.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;



    public Time(String nome) {
        this.nome = nome;

    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime (){
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Jogador jogadores: jogadores
             ) {
            System.out.println(jogadores.getNome());
        }
            
        }
    

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
