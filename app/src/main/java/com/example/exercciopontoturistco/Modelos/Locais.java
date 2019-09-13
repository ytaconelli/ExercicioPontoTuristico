package com.example.exercciopontoturistco.Modelos;

public class Locais {
    private String nome;
    private String distancia;
    private String imgScr;

    public Locais( String nome, String distancia) {
        this.nome = nome;
        this.distancia = distancia;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) { this.distancia = distancia; }

    public String getImgScr() {


        if (nome == "Catedral")
            imgScr = "https://www.diocesesaocarlos.org.br/wp-content/uploads/2015/04/catedral_sao_carlos-960x540.jpg";

        if (nome == "Parque Ecológico")
            imgScr = "https://mipal.files.wordpress.com/2012/03/agpsb2nhbc1uzxdzcg4legvjbwfnzrjzof8cda1.jpg";

        return imgScr;
    }

    public void setImgScr(String imgScr) {
        this.imgScr = imgScr;
    }
}
