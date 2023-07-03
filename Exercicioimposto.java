public class Exercicioimposto {
    public static void main(String[] args) {
        /* salario  ate 34712:   imposto devido   :9,7%
         ate 68507        imposto 37,35%
        acima    imposto 49,50%
         */

       double salarioanual = 500000;
       double primeiroimposto = 9.7 / 100;
       double segundoimposto = 37.35 / 100;
       double terceiroimposto = 49.50 / 100;
       double valordoimposto;



       //processamendo
        if (salarioanual < 34712 ) {
            valordoimposto = salarioanual * primeiroimposto;


        } else if (salarioanual > 34712 && salarioanual < 68507) {
          valordoimposto = salarioanual * segundoimposto;

        }else {
         valordoimposto = salarioanual * terceiroimposto;

        }


        System.out.println("valor devido : " + valordoimposto);
        System.out.println("valor salario corrigido : " + (salarioanual - valordoimposto));



    }
}
