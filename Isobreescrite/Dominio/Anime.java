package maratona.java.javacore.Isobreescrite.Dominio;

public class Anime {
    private  String nome;


//Atalho generate to String

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome){
        this.nome = nome;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
