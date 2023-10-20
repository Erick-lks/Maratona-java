package maratona.java.javacore.Oexecption.Runtime.test;

public interface RuntimeExcptiontest {
    public static void main(String[] args) {

        System.out.println(divisao(1, 0));

    }

    public static int divisao(int a , int b) {
         if (b == 0){
             throw new RuntimeException("nao pode ser 0");
         }
       /*  try {
             return a / b;

         } catch (RuntimeException e) {
             e.printStackTrace();
         }*/
         return a/b;
     }}



//error de arithmeticException
//divisao por 0

