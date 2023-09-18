package com.main.components;

import java.util.ArrayList;
import java.util.List;

import com.main.components.resources.Musica;

public class ReprodutorDeMusica {
    private List<Musica> bibliotecaMusica;
    private Musica musicaAtual = null;
    private boolean estaTocando = false;

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public boolean estaTocando() {
        return estaTocando;
    }

    public List<Musica> getBibliotecaMusicas() {
        return bibliotecaMusica;
    }

    public ReprodutorDeMusica(){
        bibliotecaMusica = new ArrayList<>();
    }

    public void pausar(){
        estaTocando = false;
    }

    public void tocar(){
        if(musicaAtual == null && !bibliotecaMusica.isEmpty())
            musicaAtual = bibliotecaMusica.get(0);
        estaTocando = true;
    }

    public void selecionarMusica(String musicaDesejada){
        for(Musica musica : bibliotecaMusica){
            if(musica.getNome().equals(musicaDesejada)){
                musicaAtual = musica;
            }
        }
    }

    public void adicionarMusica(Musica musicaNova){
        bibliotecaMusica.add(musicaNova);
    }

    public void removerMusica(String musicaParaRemover){
        for(Musica musica : bibliotecaMusica){
            if(musica.getNome().equals(musicaParaRemover)){
                bibliotecaMusica.remove(musica);
                return;
            }
        }
    }

}
