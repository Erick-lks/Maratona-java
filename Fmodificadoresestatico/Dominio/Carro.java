package maratona.java.javacore.Fmodificadoresestatico.Dominio;

public class Carro {
    private  String nome;
    private double velocidademaxima;

    //modificador agora pertence a carro!!
    public static double velocidadelimite  = 250;

    public Carro(String nome, double velocidademaxima) {
        this.nome = nome;
        this.velocidademaxima = velocidademaxima;
    }

    public void imprime(){

        System.out.println("---------------------------");
        System.out.println("Nome  "+ this.nome);
        System.out.println("Velocidade Maxima:  "+ this.velocidademaxima);
        System.out.println("Velocidade Limite:  "+ Carro.velocidadelimite);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

}
