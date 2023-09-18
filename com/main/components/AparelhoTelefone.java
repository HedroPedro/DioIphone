package com.main.components;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefone {
    private List<Long> contatos;
    private Long numero;
    private boolean estaNoCorreioDeVoz = false;

    public Long getNumero() {
        return numero;
    }

    public List<Long> getContatos() {
        return contatos;
    }

    public boolean isEstaNoCorreioDeVoz() {
        return estaNoCorreioDeVoz;
    }

    public AparelhoTelefone(Long numero){
        contatos = new ArrayList<Long>();
        this.numero = numero;
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

    public void ligarParaNumero(Long numero){
        System.out.println("Ligando para o numero " + numero);
    }

    public void inciarCorreioDeVoz(){
        estaNoCorreioDeVoz = true;
    }

    public void atenderChamada(){
        System.out.println("Atendendo ligação...");
    }
}
