package maratona.java.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        //metodo abstrato implementado
        calcularbonus();
    }




    //para metodos abstratos nao devem ter corpo porem devem estrar sobrescrito sua ação no proprio objeto
    public abstract void calcularbonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo....");
    }
}
