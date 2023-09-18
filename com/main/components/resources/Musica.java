package com.main.components.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Musica{
    private String nome;
    private String autor;
    private List<String> generosMusicais;
    private Date dataDeLancamento;
    
    public Musica(String nome, String autor, Date dataDeLancamento,  String... generosMusicais){
        this.nome = nome;
        this.autor = autor;
        this.generosMusicais = new ArrayList<String>(Arrays.asList(generosMusicais));
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public String toString() {
        return String.format("{Titulo: %s;Autor: %s;Generos musicais: %s;Data de lançamento: %s}", nome, autor, generosMusicais.toString(), dataDeLancamento.toString());
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public List<String> getGenerosMusicais() {
        return generosMusicais;
    }

    public Date getDataDeLancamento() {
        return dataDeLancamento;
    }
}
