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
public class Controle {

    private int numeroJogada;
    private int tempoRodada;
    private int pontuacao;
    private int pontosGanhos;
    private int pontosJogada;
    private int multiplicadorNivel;
    private int multiplicadorBonus;
    private int habilidade;
    private int moeda;
    private int somaMoedas;
    private int subtracaoPontuacao;
    private int pontuacaoTotal;

    public int[] arrayBotoesApertados;

    public Controle() {
        this.pontuacao = 0;
        this.pontuacaoTotal = 0;
        this.numeroJogada = 0;
        this.tempoRodada = 90;
        this.pontosJogada = 100;
        this.multiplicadorNivel = 1;
        this.multiplicadorBonus = 2;
        this.habilidade = 0;
        this.somaMoedas = 0;

        this.arrayBotoesApertados = new int[2];
        this.arrayBotoesApertados[0] = 0;
        this.arrayBotoesApertados[1] = 0;
    }

    public int getNumeroJogada() {
        return numeroJogada;
    }

    public int getTempoRodada() {
        return this.tempoRodada;
    }

    public void setPontosGanhos() {
        this.pontosGanhos = pontosJogada * multiplicadorNivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getMultiplicadorNivel() {
        return multiplicadorNivel;
    }

    public void setMultiplicadorNivel() {
        this.multiplicadorNivel++;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getSomaMoedas() {
        return somaMoedas;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    } 

    public void setPontuacaoTotal() {
        this.pontuacaoTotal = this.pontuacao;
    }   
    
    public void multiplicaBonus() {
        this.pontosJogada *= multiplicadorBonus;
    }

    public void somaJogada() {
        this.numeroJogada++;
    }

    public boolean verificarJogada() {
        boolean jogadaVerificada;

        if (this.numeroJogada == 2) {
            jogadaVerificada = true;
            this.numeroJogada = 0;
        } else {
            jogadaVerificada = false;
        }

        return jogadaVerificada;

    }

    public void guardarBotao(int botao) {
        for (int contador = 0; contador < 2; contador++) {
            if (this.arrayBotoesApertados[contador] == 0) {
                this.arrayBotoesApertados[contador] = botao;
                break;
            }
        }
    }

    public void reiniciaBotao() {
        this.arrayBotoesApertados[0] = 0;
        this.arrayBotoesApertados[1] = 0;
    }

    public void somaPontuacao() {
        this.pontuacao += pontosGanhos;
    }

    public void somaHabilidade() {
        this.habilidade += 10;
    }

    public boolean verificaHabilidade() {
        if (habilidade == 100) {
            return true;
        } else {
            return false;
        }
    }

    public void reiniciarHabilidade() {
        this.habilidade = 0;
    }

    public int configuraPontuacao() {
        moeda = (this.pontuacao / 10) / 10;
        subtracaoPontuacao = this.pontuacao / 10;

        return moeda;
    }

    public void atualizaMoeda(double moedaAtual) {
        somaMoedas += moedaAtual;
        pontuacaoTotal -= subtracaoPontuacao;
    }
}
