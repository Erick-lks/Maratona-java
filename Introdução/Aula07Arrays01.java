package Introdução;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //para vetores vazios
        //int, byte, float, double e short = 0
        //char '/u0000' ou ' '
        //String null
        int [] idades = new int[3];
        idades[0] = 1;
        idades[1] = 15;
        idades[2] = 21;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
