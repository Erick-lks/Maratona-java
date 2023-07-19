package maratona.java.javacore.Bintroducaometodos.Test;

import maratona.java.javacore.Bintroducaometodos.Dominio.Pessoa;


public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

      pessoa.setNome("jiraya");
      pessoa.setIdade(35);

      pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }

}
//para set (prescisa de argumento ) e para get usa espaco em memoria nao necessario utilizar um argumento
