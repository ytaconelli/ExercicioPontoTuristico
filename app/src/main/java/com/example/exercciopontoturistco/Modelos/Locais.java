package com.example.exercciopontoturistco.Modelos;

public class Locais {
    private String nome;
    private String distancia;
    private Integer imagem;

    public Locais(Integer imagem, String nome, String distancia) {
        this.nome = nome;
        this.distancia = distancia;
        this.imagem = imagem;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDistancia() { return distancia; }

    public void setDistancia(String distancia) { this.distancia = distancia; }

    public Integer getImagem() { return imagem; }

    public void setImagem(Integer id) { this.imagem = imagem; }

}
