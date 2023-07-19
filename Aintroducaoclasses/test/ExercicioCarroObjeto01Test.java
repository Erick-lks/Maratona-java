package maratona.java.javacore.Aintroducaoclasses.test;
/*Crie classe carro com seguintes atribudos
Nome
Modelo
Ano

em seguida , crie dois objetos distindos e imprima seus valores
*/

import maratona.java.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioCarroObjeto01Test {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Argo";
        carro1.ano = 2020;
        carro1.modelo = "Drive";

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        carro2.nome = "Clio";
        carro2.ano = 2009;
        carro2.modelo = "Campus";
        System.out.println("-------------------------------------");
        System.out.println("carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);


    }
}
