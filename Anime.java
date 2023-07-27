package maratona.java.javacore.Fmodificadoresestatico.Dominio;

public class Anime {
    private String nome;
    private static int[] epsodios;
    //bloco de inicialização static

    static {
        System.out.println("Inicialização de bloco estatico 01");

    }
    static {
        System.out.println("Inicialização de bloco estatico 02");

    }
    static {
        System.out.println("Inicialização de bloco estatico 03");

    }


    {
        System.out.println("inicializaçao de bloco nao estatico ");
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
            epsodios[i] = 1 + i;


        }

        for (int epsodios : Anime.epsodios
        ) {
            System.out.print(epsodios + " ");

        }



    }
}



//DICAS
// 0 - o bloco de inicialização estatico e executado primeiro e so uma vez !
//1 - Alocado espaço em memoria pro objeto
//2- cada atributo de classe é criado e inicializado valores default ou o quer foi passada
//3-Bloco de inicialização é executado
//4- costrutor é executado




//diferenca entre o estatico e o nao estatico é que o nao estatico vai executar a cada objeto novo