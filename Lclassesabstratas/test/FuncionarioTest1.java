package maratona.java.javacore.Lclassesabstratas.test;

import maratona.java.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratona.java.javacore.Lclassesabstratas.dominio.Funcionario;
import maratona.java.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nany" , 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Caetano" , 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
