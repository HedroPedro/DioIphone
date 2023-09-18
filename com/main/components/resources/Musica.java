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
    
    public Musica(String nome, String autor, String[] generosMusicais, Date dataDeLancamento){
        this.nome = nome;
        this.autor = autor;
        this.generosMusicais = new ArrayList<String>(Arrays.asList(generosMusicais));
        this.dataDeLancamento = dataDeLancamento;
    }
}
