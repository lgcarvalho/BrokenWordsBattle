/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author carvalui
 */
public class Mestre {
    private String nome;
    private String imagem;
    
    public Mestre(String nome, String imagem) {
        this.nome = nome;
        this.imagem = "/imagens/" + imagem + ".png";
    }

    public String getNome() {
        return nome;
    }

    public String getImagem() {
        return imagem;
    }
    
}
