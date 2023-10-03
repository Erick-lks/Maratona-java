package maratona.java.javacore.Minterfaces.Test;

import maratona.java.javacore.Minterfaces.Dominio.DataBaseLoader;
import maratona.java.javacore.Minterfaces.Dominio.DataLoader;
import maratona.java.javacore.Minterfaces.Dominio.FileLoader;

public class DataLoaderTest0 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
