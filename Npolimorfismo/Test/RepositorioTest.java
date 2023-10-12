package maratona.java.javacore.Npolimorfismo.Test;

import maratona.java.javacore.Npolimorfismo.Repository.Repositorio;
import maratona.java.javacore.Npolimorfismo.Service.RepositorioArquivo;
import maratona.java.javacore.Npolimorfismo.Service.RepositorioBancodeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
      Repositorio repositorio = new RepositorioBancodeDados();
      repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Naruto");
        list.add("Kizame");
        list.add("Deidara");

        List<String> list1 = new LinkedList<>();
        list1.add("Tanzero");


}}
