package maratona.java.javacore.Fmodificadoresestatico.Test;

import maratona.java.javacore.Fmodificadoresestatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2= new Carro("Mercedes" , 270);
        Carro c3 = new Carro("Audi" , 250);


        //modificador
        //afeta todos os objetos
        Carro.velocidadelimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
