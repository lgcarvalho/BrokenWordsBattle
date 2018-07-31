/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luiz
 */
public class Rank {

    private String apelido;
    private String usuario;
    private int pontuacao;
    private String heroi;

    public Rank(String apelido, String usuario, int pontuacao, String heroi) {
        this.apelido = apelido;
        this.usuario = usuario;
        this.pontuacao = pontuacao;
        this.heroi = heroi;
    }

    public String getApelido() {
        return apelido;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getHeroi() {
        return heroi;
    }

}
