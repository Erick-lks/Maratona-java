package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        // funcionario.salario = new double[] {3500,12500,1000};


        funcionario.setNome("Jinn");
        funcionario.setIdade(25);
        funcionario.setSalario1(3550);
        funcionario.setSalario2(1200);
        funcionario.setSalario3(1000);


      funcionario.getNome();
      funcionario.getIdade();
      funcionario.getSalario1();
      funcionario.getSalario2();
      funcionario.getSalario3();


        funcionario.imprime();
        funcionario.mediasalario();

    }
}
