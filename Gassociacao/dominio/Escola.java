package maratona.java.javacore.Gassociacao.dominio;

public class Escola {
    private  String nome;

    private Professor[] professores;


    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores == null){ return;
        }
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }







}}
