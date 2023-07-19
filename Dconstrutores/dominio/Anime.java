package maratona.java.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int epsidoios;

    private String nome;
    private String genero;


    public Anime(String tipo , int epsidoios , String nome , String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.epsidoios = epsidoios;
        this.genero = genero;
    }
// para adicionar um construtor novo ele e o inicializador
  //  public Anime(){

//    }





    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.epsidoios);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }


//public void init(String tipo , int epsidoios , String nome){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.epsidoios = epsidoios;
//
//}
//
//
//public void init(String tipo , int epsidoios , String nome , String genero){
//        this.init(tipo , epsidoios ,nome);
//        this.genero = genero;
//}


    public void setTipo (String tipo){this.tipo = tipo;}

    public String getTipo() {return tipo;}


    public void setEpsidoios(int epsidoios){this.epsidoios = epsidoios;}
    public int getEpsidoios(){return this.epsidoios;}


    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return this.nome;}

}
