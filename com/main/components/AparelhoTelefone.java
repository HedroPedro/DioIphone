package com.main.components;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefone {
    List<Long> contatos;

    public AparelhoTelefone(){
        contatos = new ArrayList<Long>();
    }

    public List<Long> listarContatos(){
        return contatos;
    }

    public void adicionarContato(Long numero){
        contatos.add(numero);
    }

    public void removerContato(Long numero){
        for(Long l : contatos){
            if(l == numero){
                contatos.remove(numero);
                return;
            }
        }
    }
}
