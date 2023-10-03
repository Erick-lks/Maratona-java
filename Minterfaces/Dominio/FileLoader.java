package maratona.java.javacore.Minterfaces.Dominio;

public class FileLoader implements DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo......");
    }

    @Override
    public void remove() {
        System.out.println("Deletando Arquivo......." );
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes de arquivos....");
    }
}
