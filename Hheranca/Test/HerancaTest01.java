package maratona.java.javacore.Hheranca.Test;

import maratona.java.javacore.Hheranca.dominio.Endereco;
import maratona.java.javacore.Hheranca.dominio.Funcionario;
import maratona.java.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 5");
        endereco.setCep("12354-586");
        Pessoa pessoa = new Pessoa("Joana Dark");

        pessoa.setCpf("123.456.789-14");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("__-----__ ");
        Funcionario funcionario = new Funcionario("Jorge Amado");

        funcionario.setCpf("321.654.987.-15");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);


        funcionario.imprime();



    }
}
