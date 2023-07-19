package maratona.java.javacore.Aintroducaoclasses.test;


import maratona.java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args)
    {
        Estudante estudante = new Estudante();
       estudante.nome= "Joao";
       estudante.idade= 15;
       estudante.sexo= 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        //referencia da memoria alcocada
        System.out.println(estudante);

    }
}
