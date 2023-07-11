public class Aula07Arrays03 {
    public static void main(String[] args) {

        int [] numeros = new int[4];
       // int [] nomes2 = {0,1,2,3,4,5};
        //ou
        int [] numeros3 = new int[]{0,1,2,3,4,5};

     //   for (int i = 0; i < numeros3.length; i++){
      //      System.out.println(numeros3[i]);
        for (int num :numeros3
             ) {
            System.out.println(num);
        }
    }
}
