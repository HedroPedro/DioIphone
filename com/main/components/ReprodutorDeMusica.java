package com.main.components;

import java.util.List;

import com.main.components.resources.Musica;

public class ReprodutorDeMusica {
    private List<Musica> bibliotecaMusicas;
    private Musica musicaAtual = null;
    private boolean estaTocando = false;

    public void pausar(){
        estaTocando = false;
    }

    public void tocar(){
        estaTocando = true;
    }

    public void selecionarMusica(Musica musicaDesejada){
        for(Musica musica : bibliotecaMusicas){
            if(musica.equals(musicaDesejada)){
                musicaAtual = musicaDesejada;
            }
        }
    }

    public void adicionarMusica(Musica musicaNova){
        bibliotecaMusicas.add(musicaNova);
    }

}
