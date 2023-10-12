package maratona.java.javacore.Oexecption.test;

public class stackOverflowtest01 {
    public static void main(String[] args) {
        recursividade();

    }
       public static void recursividade(){
           recursividade();


    }
}
  //Erro de recurividade stackoverflow