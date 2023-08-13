package maratona.java.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;




    public Professor(String nome, String historia, String seminarioDeHistoria) {
        this.nome = nome;

    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("_-------_");
        System.out.println("Professor : " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("##Seminarios disponveis##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) continue;
            System.out.println("##Alunos##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Alunos " + aluno.getNome() + " Idade " + aluno.getIdade());

            }


        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
