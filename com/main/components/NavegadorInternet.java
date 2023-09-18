package com.main.components;

import java.util.Arrays;
import java.util.List;

public class NavegadorInternet {
    private List<String> abas = Arrays.asList("//home/");
    private String paginaAtual = "//home/";

    public NavegadorInternet(){
        super();
        System.out.println("Pagina atual: " + paginaAtual);
    }
    
    public void excluirAba(int index){
        abas.remove(index);
    }

    public void exibirPagina(int index){
        paginaAtual = abas.get(index);
    }

    public void adicionarAba(String url){
        abas.add(url);
    }
}
