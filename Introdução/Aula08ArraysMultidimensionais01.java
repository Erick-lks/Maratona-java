package Introdução;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] dias = new  int[3][3];

        dias [0] [0] = 31;
        dias [0] [1] = 28;
        dias [0] [2] = 30;

        dias [1] [0] = 31;
        dias [1] [1] = 28;
        dias [1] [2] = 30;

        dias [2] [0] = 31;
        dias [2] [1] = 28;
        dias [2] [2] = 30;
//*  pode se usar Forech porem criar int ArrArrays

       for (int i = 0; i < dias.length; i++){
           for (int j = 0 ; j < dias[i].length; j++)
           {
               System.out.println(dias[i][j]);
           }
       }
}}
