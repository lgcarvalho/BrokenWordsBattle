/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;

/**
 *
 * @author Luiz
 */
public class Heroi {
    private String nomeHeroi;
    private String imagemHeroi;
    private Color color;
    
    public Heroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getImagemHeroi() {
        return imagemHeroi;
    }

    public void setImagemHeroi(String imagemHeroi) {
        this.imagemHeroi = imagemHeroi;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }    
    
    public void defineHeroi() {
        switch (this.nomeHeroi) {
            case "CIBORG":
                this.imagemHeroi = "/imagens/imagemCiborgMenor.png";
                this.color = new Color(0,0,0);
                break;
            case "ANDROID":
                this.imagemHeroi = "/imagens/imagemAndroidMenor.png";
                this.color = new Color(153,153,255);
                break;
            case "PYRO":
                this.imagemHeroi = "/imagens/imagemPyroMenor.png";
                this.color = new Color(204,0,0);
                break;
            case "VIKING":
                this.imagemHeroi = "/imagens/imagemVikingMenor.png";
                this.color = new Color(0,153,51);
                break;
            default:
                this.imagemHeroi = "/imagens/imagemAprendiz.png";
                this.color = new Color(153,0,255);
        }
    }
}
