package com.main.components;

import java.util.ArrayList;
import java.util.List;

import com.main.components.resources.Musica;

public class ReprodutorDeMusica {
    private List<Musica> bibliotecaMusicas;
    private Musica musicaAtual = null;
    private boolean estaTocando = false;

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public List<Musica> getBibliotecaMusicas() {
        return bibliotecaMusicas;
    }

    public ReprodutorDeMusica(){
        bibliotecaMusicas = new ArrayList<>();
    }

    public void pausar(){
        estaTocando = false;
    }

    public void tocar(){
        musicaAtual = bibliotecaMusicas.get(0);
        estaTocando = true;
    }

    public void selecionarMusica(String musicaDesejada){
        for(Musica musica : bibliotecaMusicas){
            if(musica.getNome().equals(musicaDesejada)){
                musicaAtual = musica;
            }
        }
    }

    public void adicionarMusica(Musica musicaNova){
        bibliotecaMusicas.add(musicaNova);
    }

}
