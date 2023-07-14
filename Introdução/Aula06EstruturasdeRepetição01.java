package Introdução;

public class Aula06EstruturasdeRepetição01 {
    public static void main(String[] args) {
        //while , do while ,for

        int contador = 0;

       while (contador <= 10){
            System.out.println(contador);
        contador += 1;
           contador++;
        }
        do {
            System.out.println("vai executar antes de verificar condição" +  ++contador);

        } while (contador < 10);

         for (int i=0 ;i <= 10;i++){
             System.out.println("for " + i );
         }
    }
}
