package maratona.java.javacore.Gassociacao.Test;

import maratona.java.javacore.Gassociacao.dominio.Escola;
import maratona.java.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
       Professor[] profesorres = { professor1 , professor2};


        Escola escola = new Escola("konoha", profesorres);

        escola.imprime();





    }}