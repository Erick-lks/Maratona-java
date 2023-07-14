package Introdução;

public class ExercicioRepeticao02 {
    public static void main(String[] args) {
        //Dado um valor de um carro descubra em quantas vezes ele possa ser parcelado
        // carro condição e que valor da parcela tem que ter >= 1000



        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valordaparcela = valorTotal / parcela;

            if (valordaparcela < 1000){
                       break;
        }
                System.out.println("parcela " + parcela + " R$  " + valordaparcela);

        }
    }
}
