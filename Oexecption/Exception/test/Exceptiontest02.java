package maratona.java.javacore.Oexecption.Exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest02 {
    public static void main(String[] args) throws IOException{

        criarNovoArquivo();
    }
        private static void criarNovoArquivo() throws IOException {
            File file = new File("arquivo\\teste.txt");
            try {
                boolean iscriado = file.createNewFile();
                System.out.println("Arquivo criado " + iscriado);
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            }
        }

                //nao coloca regras de negocio no cath
                //se for privado utiliza os trycatch (em alguns casos)
                // se for public utilize if (em alguns casos)
                /*
                "Uma regra de negócio é uma declaração ou restrição que define
                // ou orienta o funcionamento de um determinado negócio ou processo. Ela representa um requisito ou
                // condição que deve ser cumprido."
                 */



}
