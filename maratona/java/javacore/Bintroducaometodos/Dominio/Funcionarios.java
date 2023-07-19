package maratona.java.javacore.Bintroducaometodos.Dominio;

public class Funcionarios {
    public String nome;
    public int idade;

    // public double[] salario;
    public int salario1;
    public int salario2;
    public int salario3;

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

}