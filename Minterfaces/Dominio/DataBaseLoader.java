package maratona.java.javacore.Minterfaces.Dominio;

public class DataBaseLoader implements  DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando dados do BD.....");

    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de Dados .....");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados ...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface na classe DataBaseLoader");
}}
