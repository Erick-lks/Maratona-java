package maratona.java.javacore.Gassociacao.Test;

import java.util.Scanner;

class Leituratest01 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite seu nome abaixo");
            String nome = entrada.nextLine();
            System.out.println("Digite sua idade");
            int idade = entrada.nextInt();
            System.out.println("Digite M ou F para seu sexo");
            char sexo = entrada.nextLine().charAt(0);



            System.out.println("_------------------------------_");

            System.out.println("Nome : " + nome);
            System.out.println("Idade : " + idade);
            System.out.println("Sexo : " + sexo);
        }
    }


