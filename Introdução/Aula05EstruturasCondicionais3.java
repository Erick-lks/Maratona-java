package Introdução;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        //doacçao se tiver 500 doar se nao nao doar

        double salario= 100;
        String mensagemdoar = "Vou doar para caridade";
        String mensagemnaodoar = "Nao tenho , mas quem sabe da proxima vez";
        // condicao ténario (condiçao) ? verdadeiro : falso;
        String resultado = (salario > 500) ? mensagemdoar : mensagemnaodoar;

       // if (salario > 500)
      //  { resultado = mensagemdoar;

    //}  else  {
      //      resultado = mensagemnaodoar;
    System.out.println(resultado);}}
