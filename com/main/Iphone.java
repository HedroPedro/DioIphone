package com.main;

import java.util.Date;

import com.main.components.AparelhoTelefone;
import com.main.components.NavegadorInternet;
import com.main.components.ReprodutorDeMusica;
import com.main.components.resources.Musica;

public class Iphone{
    private final String MODELO = "Iphone 1";
    private AparelhoTelefone contatos;
    private ReprodutorDeMusica reprodutorDeMusica;
    private NavegadorInternet navegadorInternet;

    public static void main(String[] args){
        Iphone iphone = new Iphone(551499999L);
        iphone.reprodutorDeMusica.adicionarMusica(new Musica("River of despair", "The Binding of issac Team", new Date(2021, 02, 01), "rock", "game music"));
        iphone.reprodutorDeMusica.tocar();
        System.out.println("A musica " + iphone.reprodutorDeMusica.getMusicaAtual().getNome() + " esta sendo tocada");
        iphone.contatos.adicionarContato(5512349999L);
        iphone.contatos.ligarParaNumero(5512349999L);
                 
    }

    public Iphone(Long numero){
        contatos = new AparelhoTelefone(numero);
        reprodutorDeMusica = new ReprodutorDeMusica();
        navegadorInternet = new NavegadorInternet(); 
    }

    
}