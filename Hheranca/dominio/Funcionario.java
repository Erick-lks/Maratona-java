package maratona.java.javacore.Hheranca.dominio;

public class Funcionario extends  Pessoa{
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estatico Funcionario");
    }
    {
        System.out.println("dentro do bloco de inicialização Funcionario 1");
    }
    {
        System.out.println("dentro do bloco de inicialização Funcionario 2");
    }


    public Funcionario(String nome){
        super(nome);

    }


    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatoriodepagamento(){
        System.out.println("Eu " + this.nome + "recebi o valor de : " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
