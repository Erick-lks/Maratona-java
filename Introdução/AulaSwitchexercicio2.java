package Introdução;

public class AulaSwitchexercicio2 {
    public static void main(String[] args) {
        // utilize a estrutura swtich para m masculino e f para feminino


        char sexo = 'F';

        switch (sexo)
        {
            case 'M':
                System.out.println("Masculino");
                break;

            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Digito invalido ");
                break;

        }
    }
}
