package maratona.java.javacore.Hheranca.dominio;
// extends Objets e padrao do java que e avo da subclasse funcionario
//isso e implicito no java nao ha necessidade de declaração
public class Pessoa extends Object{
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco de inicialização estatico Pessoa");
    }
    {
        System.out.println("dentro do bloco de inicialização Pessoa 1");
    }
    {
        System.out.println("dentro do bloco de inicialização Pessoa 2");
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome , String cpf){
        this(nome);
        this.cpf = cpf;

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " "+ this.endereco.getCep());

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
// protected serve para ampliar o acesso entre o mesmo pacote.
//* 0- inicializaçao do bloco estatico superclasse
// 1- inicializaçao dos blocos não estatico da superclasse(pai)
// 2- objeto da superclasse
// 3- inicialiação do bloco estatico da subclasse filha
// 4- inicialização do bloco nao estatico subclasse(filha)
//5 - objetos subclasse


