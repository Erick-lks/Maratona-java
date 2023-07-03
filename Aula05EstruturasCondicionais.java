public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //18 > idade pode comprar bebida se nao nao autorizado
        // utilizar if e imprimir o resultado


        int idade= 25;
        boolean isautorizadoacomprar = idade >= 18;
        boolean isnaoautorizado = idade < 18;
            if (idade >= 18)

                System.out.println("Esta autorizado a comprar!");

             else{
            System.out.println("Não autorizado menor de idade");}
 // pode se utilizar desta forma

          //if(!isnaoautorizado)
           //   System.out.println("esta autorizado a comprar!");

        //OUTRA FORMA
        //if (isautorizadoacomprar == true)
          //  System.out.println("nao autorizado ");
}}
