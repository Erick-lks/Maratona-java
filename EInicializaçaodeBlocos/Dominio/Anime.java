package maratona.java.javacore.EInicializaçaodeBlocos.Dominio;

public class Anime {
    private String nome;
    private int[] epsodios;
    //bloco de inicialização logo abaixo

    {
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }




    public Anime() {
        epsodios = new int[100];

        for (int i = 0; i < epsodios.length; i++) {

            System.out.println(epsodios);
            epsodios[i] = 1 + i;


        }

        for (int epsodios : this.epsodios
        ) {
            System.out.print(epsodios + " ");

        }



    }
}



//DICAS

//1 - Alocado espaço em memoria pro objeto
//2- cada atributo de classe é criado e inicializado valores default ou o quer foi passada
//3-Bloco de inicialização é executado
//4- costrutor é executado