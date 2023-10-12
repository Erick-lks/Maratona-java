package maratona.java.javacore.Npolimorfismo.Service;

import maratona.java.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um Arquivo");
    }
}
