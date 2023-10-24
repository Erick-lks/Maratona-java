package maratona.java.javacore.Oexecption.Runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExptiontest02 {
    public static void main(String[] args) {
        try {

            throw new RuntimeException();


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (NullPointerException e){
            System.out.println("Dentro do NullPointerException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }
        //a mais generica das exception
        catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
        try {
            talvezLanceException();
        }catch (SQLException throwables){
            throwables.printStackTrace();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

// Lançado exception usando try cath
        //pode ter alguns caths

        private static void talvezLanceException() throws SQLException, FileNotFoundException {


        }



}