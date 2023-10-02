package maratona.java.javacore.Jmodificadorfinal.test;

import maratona.java.javacore.Jmodificadorfinal.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.comprador);
        carro.comprador.setNome("Alfredo");
        System.out.println(carro.comprador);



    }
}
