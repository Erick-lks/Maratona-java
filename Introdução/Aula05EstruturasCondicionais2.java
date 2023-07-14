package Introdução;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        // categorias se jogadores forem menores que 16 < infatil
        // jogadores > 16 e > 18 juvenil
        // jogadores > 18 adulto
        // utilizar if


        int idade = 22;
    // melhorando o code
        String categoria;


        if(idade < 16){
            //System.out.println("categoria infantil");
            categoria ="Categoria Infantil";


    }

                    else if (idade >= 16 && idade <= 18) {
            //System.out.println("categoria juvenil");}
            categoria = "Categoria Juvenil";

        }else {
                                //System.out.println("categoria adulto");
                                     categoria = "Categoria Adulto";
                                    }
        System.out.println(categoria);
}}
