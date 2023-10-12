package maratona.java.javacore.Npolimorfismo.Service;

import maratona.java.javacore.Npolimorfismo.Repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
}}

