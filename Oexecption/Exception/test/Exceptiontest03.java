package maratona.java.javacore.Oexecption.Exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest03 {
    public static void main(String[] args) {
    abreConexcao();
    abreConexcao2();

    }
    private static String abreConexcao() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevndo dados no arquivo");
            return "Conexção Aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //sempre sera executado
            System.out.println("Fechando recurso liberado pelo SISTEMA OPERACIONAL SO");
        }
        return null;
    }
    private static String abreConexcao2() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevndo dados no arquivo");
        } finally {
            //sempre sera executado
            System.out.println("Fechando recurso liberado pelo SISTEMA OPERACIONAL SO");
        }
        return null;
    }
}
