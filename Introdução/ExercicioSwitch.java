package Introdução;

public class ExercicioSwitch {
    public static void main(String[] args) {
        // dados os valores de 1 a 7 imprima se é dia util ou nao
        //considerando 1 como domingo utilizando switch




        byte dia =5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
