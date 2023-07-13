public class Aula08ArraysMultidimensionais02  {
    public static void main(String[] args) {
        int[] [] arrayint = new int[3][];

        //int [] array = {0,1,2};

        arrayint [0] = new int [1];
        arrayint [1] = new int [2];
        arrayint [2] = new int [6];

        int[] [] arrayint2 = {{0,2}, {0,1,5}, {0,2,5,6,4,7}};


        for (int[] arraybase: arrayint2
             ) {
            System.out.println("\n------------");
            for (int num : arraybase){
            System.out.print(num + " ");
        }

        }
    }
}
