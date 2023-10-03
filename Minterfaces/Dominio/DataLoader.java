package maratona.java.javacore.Minterfaces.Dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    void load();
    //todos sao publicos e abstrats

    default void checkPermission(){
        System.out.println("Realizando Checagem de Permissoes ....");
    }
  public static void retrieveMaxDataSize(){
      System.out.println("Dentro do retrieveMaxDataSize na interface");
  }

}
