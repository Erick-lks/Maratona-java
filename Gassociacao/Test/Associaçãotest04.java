package maratona.java.javacore.Gassociacao.Test;

import maratona.java.javacore.Gassociacao.dominio.Aluno;
import maratona.java.javacore.Gassociacao.dominio.Local;
import maratona.java.javacore.Gassociacao.dominio.Professor;
import maratona.java.javacore.Gassociacao.dominio.Seminario;

public class Associaçãotest04 {
    public static void main(String[] args) {
        Local local = new Local("Taguatinga sul");
        Aluno aluno = new Aluno("Julia",17);
        Professor professor = new Professor("Fábio", "historia","Seminario de historia");
        Aluno[] alunosParaSeminario = { aluno};
        Seminario seminario = new Seminario("Revoluçao Francesa", alunosParaSeminario,local);

        Seminario[] seminariosDisponiveis ={seminario};


        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
