package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        // funcionario.salario = new double[] {3500,12500,1000};


        funcionario.nome = "Joao";
        funcionario.idade = 30;

        funcionario.salario1 = 3500;
        funcionario.salario2 = 12500;
        funcionario.salario3 = 1000;


        funcionario.imprime();
        funcionario.mediasalario();

    }
}
