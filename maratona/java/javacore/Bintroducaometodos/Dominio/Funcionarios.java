package maratona.java.javacore.Bintroducaometodos.Dominio;

public class Funcionarios {
    private String nome;
    private int idade;

    // public double[] salario;
    private int salario1;
    private int salario2;
    private int salario3;

    public void mediasalario()
    {
        int media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A media salarial é de :  " + media);


    }


    public void imprime()
    {
        System.out.println(this.nome);
        System.out.println(this.idade);
//        System.out.println(this.salario1);
//        System.out.println(this.salario2);
//        System.out.println(this.salario3);


    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome =nome;
    }

    public void setSalario1(int salario1) {
        this.salario1 = salario1;
    }

    public void setSalario2(int salario2) {
        this.salario2 = salario2;
    }

    public void setSalario3(int salario3) {
        this.salario3 = salario3;
    }
    public String getNome(){
        return nome;

    }

    public int getIdade() {
        return idade;
    }

    public int getSalario1() {
        return salario1;
    }

    public int getSalario2() {
        return salario2;
    }

    public int getSalario3() {
        return salario3;
    }
}