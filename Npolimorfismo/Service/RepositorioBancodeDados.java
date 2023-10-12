package maratona.java.javacore.Npolimorfismo.Service;

import maratona.java.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um Banco de Dados");
}}
