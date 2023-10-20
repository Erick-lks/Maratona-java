package maratona.java.javacore.Oexecption.Exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
        private static void criarNovoArquivo(){
            File file = new File("arquivo\\teste.txt");
            try {
                boolean iscriado = file.createNewFile();
                System.out.println("Arquivo criado " + iscriado);
            }catch (IOException e) {
                

                e.printStackTrace();


                //nao coloca regras de negocio no cath
                //nunca deixar o bloco em branco
                //tem uma excecao acontecendo nao deixar em branco catch

            }

        }
}
