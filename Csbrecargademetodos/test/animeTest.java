package maratona.java.javacore.Csbrecargademetodos.test;

import maratona.java.javacore.Csbrecargademetodos.Dominio.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("TV", 12 , "Deomn Slayer", "Ação");





//        anime.setTipo("TV");
//        anime.getTipo();
//
//        anime.setEpsidoios(12);
//        anime.getEpsidoios();
//
//        anime.setNome("Demon slayer");
//        anime.getNome();


        anime.imprime();

    }
}
//sobrecarga e referente a mesma quantidade de parametros
