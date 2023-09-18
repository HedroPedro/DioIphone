package com.main.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NavegadorInternet {
    private List<String> abas = new ArrayList<>(Arrays.asList("//home/"));
    private String paginaAtual = "//home/";

    public NavegadorInternet(){
        super();
        System.out.println("Pagina atual: " + paginaAtual);
    }
    
    public String getPaginaAtual() {
        return paginaAtual;
    }

    public List<String> getAbas() {
        return abas;
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

    public void atualizarPagina(){
        System.out.println("Atualizando página: " + paginaAtual);
    }
}
