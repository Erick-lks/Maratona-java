package Introdução;

public class Aula04Operadores
{
    public static void main(String[] args)
    {     //+,-,/
        int numero01 = 10;
        int numero02 = 20;
        int result1 = numero01 + numero02;
        int result2 = numero01 - numero02;
        int result3 = numero01 / numero02;
        int result4 = numero01 * numero02;

        System.out.println(result3);


        // % resto de divisao (saber se o numero e par)

        int resto = 20 % 2;
        System.out.println(resto);

        //< menor > maior (<= , >=) == (comparação) != inversao
        //os valores abaixo so retorna valor V OU f

        boolean isdezmaiorquevinte = 10 >= 20 ;
        boolean isdezmenorquevinte = 10 <= 20 ;
        boolean isdezigualquevinte = 10 == 20 ;
        boolean isdezigualadez = 10 == 10 ;
        boolean isdezdiferentededez = 10 != 10 ;



        System.out.println(isdezmaiorquevinte + "o dez  maior que vinte");
        System.out.println(isdezmenorquevinte+ " o dez e menor que vinte");
        System.out.println( isdezigualquevinte+ " o dez e igualque vinte");
        System.out.println(isdezigualadez+ " tem o mesmo valor");
        System.out.println(isdezdiferentededez + " os numeros sao diferentes");


        /* Operador logico
        && and   , || ou , ! not
         */
        int idade = 35;
        float salario = 3500f;
        boolean isdentrodaleimaiorque30 = idade >= 30 && salario >= 4612;
        boolean isdentrodaleimenorque30 = idade < 30 && salario >= 3381;


        System.out.println("isdentrodaleimaiorquetrinta" + isdentrodaleimaiorque30);
        System.out.println("isdentrodaleimenorque30" + isdentrodaleimenorque30);


       double valorTotalContaCorrente = 200;
       double valorTotalContaPoupanca = 10000;
       float ps5 = 5000F;
       boolean isps5compravel = valorTotalContaCorrente > ps5 || valorTotalContaPoupanca > ps5;


        System.out.println(" é compravel " +isps5compravel);

        // = , += , -= , *= ,/= e %=
        // simplificação de variaveis exemplo bonus

        double bonus = 1800D;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2 ;

        System.out.println(bonus);


        //++ --
        int incrementador = 0;
        incrementador += 1; //contador 1 + 1
        // incrementador ++1 o mesmo acima
        System.out.println(incrementador);




    }
}
