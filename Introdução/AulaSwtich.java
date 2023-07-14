package Introdução;

public class AulaSwtich {
    public static void main(String[] args) {
        //imprima o dia da semana , considerando 1 como domingo
        byte dia = 5;
        // byte,char,short,string
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Digite um numero valido de 1 a 7");
                break;

        }
    }
}
