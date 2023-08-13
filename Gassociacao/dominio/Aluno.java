package maratona.java.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private String[] aluno;
    private Seminario seminario;

    private  int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
