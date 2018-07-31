/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author carvalui
 */
public class Palavras {

    Random r = new Random();

    private String palavraSorteada;
    private String palavraFormada;

    private int indice;

    private LinkedList<String> listaPalavras = new <String> LinkedList();
    private Stack<String> pilhaPalavras = new <String> Stack();

    public Palavras() {
        this.palavraFormada = "";
        listaPalavras.add("Arca");
        listaPalavras.add("Anjo");
        listaPalavras.add("Acre");
        listaPalavras.add("Alma");
        listaPalavras.add("Água");
        listaPalavras.add("Arte");
        listaPalavras.add("Alto");
        listaPalavras.add("Base");
        listaPalavras.add("Bode");
        listaPalavras.add("Bala");
        listaPalavras.add("Belo");
        listaPalavras.add("Boxe");
        listaPalavras.add("Cana");
        listaPalavras.add("Cubo");
        listaPalavras.add("Cama");
        listaPalavras.add("Cone");
        listaPalavras.add("Cedo");
        listaPalavras.add("Cabo");
        listaPalavras.add("Casa");
        listaPalavras.add("Café");
        listaPalavras.add("Cego");
        listaPalavras.add("Capa");
        listaPalavras.add("Caro");
        listaPalavras.add("Doce");
        listaPalavras.add("Dano");
        listaPalavras.add("Dedo");
        listaPalavras.add("Dado");
        listaPalavras.add("Fada");
        listaPalavras.add("Fino");
        listaPalavras.add("Furo");
        listaPalavras.add("Face");
        listaPalavras.add("Fase");
        listaPalavras.add("Frio");
        listaPalavras.add("Foto");
        listaPalavras.add("Flor");
        listaPalavras.add("Fuga");
        listaPalavras.add("Fiel");
        listaPalavras.add("Fome");
        listaPalavras.add("Gema");
        listaPalavras.add("Gelo");
        listaPalavras.add("Gato");
        listaPalavras.add("Guia");
        listaPalavras.add("Ilha");
        listaPalavras.add("Jogo");
        listaPalavras.add("Joia");
        listaPalavras.add("Juiz");
        listaPalavras.add("Kiwi");
        listaPalavras.add("Luva");
        listaPalavras.add("Leal");
        listaPalavras.add("Lama");
        listaPalavras.add("Lixo");
        listaPalavras.add("Luxo");
        listaPalavras.add("Lata");
        listaPalavras.add("Luta");
        listaPalavras.add("Leão");
        listaPalavras.add("Liso");
        listaPalavras.add("Laço");
        listaPalavras.add("Mago");
        listaPalavras.add("Mito");
        listaPalavras.add("Mudo");
        listaPalavras.add("Mapa");
        listaPalavras.add("Mira");
        listaPalavras.add("Maça");
        listaPalavras.add("Meia");
        listaPalavras.add("Meio");
        listaPalavras.add("Mala");
        listaPalavras.add("Mesa");
        listaPalavras.add("Muro");
        listaPalavras.add("Moda");
        listaPalavras.add("Medo");
        listaPalavras.add("Moto");
        listaPalavras.add("Neve");
        listaPalavras.add("Nave");
        listaPalavras.add("Nado");
        listaPalavras.add("Nojo");
        listaPalavras.add("Novo");
        listaPalavras.add("Onça");
        listaPalavras.add("Ódio");
        listaPalavras.add("Pele");
        listaPalavras.add("Pipa");
        listaPalavras.add("Pato");
        listaPalavras.add("Pera");
        listaPalavras.add("Pena");
        listaPalavras.add("Peça");
        listaPalavras.add("País");
        listaPalavras.add("Pião");
        listaPalavras.add("Povo");
        listaPalavras.add("Peso");
        listaPalavras.add("Rato");
        listaPalavras.add("Remo");
        listaPalavras.add("Rede");
        listaPalavras.add("Rima");
        listaPalavras.add("Reto");
        listaPalavras.add("Rixa");
        listaPalavras.add("Raiz");
        listaPalavras.add("Rota");
        listaPalavras.add("Roda");
        listaPalavras.add("Raro");
        listaPalavras.add("Seca");
        listaPalavras.add("Seda");
        listaPalavras.add("Sapo");
        listaPalavras.add("Soja");
        listaPalavras.add("Sofá");
        listaPalavras.add("Sujo");
        listaPalavras.add("Saga");
        listaPalavras.add("Sino");
        listaPalavras.add("Tatu");
        listaPalavras.add("Tipo");
        listaPalavras.add("Topo");
        listaPalavras.add("Trem");
        listaPalavras.add("Time");
        listaPalavras.add("Taxa");
        listaPalavras.add("Taxi");
        listaPalavras.add("Vida");
        listaPalavras.add("Vaso");
    }

    public String[] sortearPalavra() {
        String[] listaCompleta = new String[16];
        LinkedList<String> listaSorteada = new <String> LinkedList();

        for (int i = 0; i < 8; i++) {
            indice = r.nextInt(40);
            String palavraValidar = listaPalavras.get(indice);
            if (listaSorteada.contains(palavraValidar)) {
                i--;
            } else {
                listaSorteada.add(palavraValidar);
            }
        }

        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < 8; i++) {
            palavraSorteada = listaSorteada.get(i);
            System.out.println("palavra: " + palavraSorteada);
            char[] arrayChar = palavraSorteada.toCharArray();

            int index = 0;

            for (int in = 0; in < 2; in++) {
                String primeiraSilaba = Character.toString(arrayChar[index]);
                index++;
                String segundaSilaba = Character.toString(arrayChar[index]);
                index++;
                String silabaCompleta = primeiraSilaba + segundaSilaba;
                pilhaPalavras.add(silabaCompleta);
            }
        }

        ArrayList<Integer> listaIndices = new <Integer> ArrayList();

        int i = pilhaPalavras.size();
        indice = r.nextInt(16);

        while (i > 0) {
            if (listaIndices.contains(indice)) {
                indice = r.nextInt(16);
            } else {
                listaCompleta[indice] = pilhaPalavras.pop();
                listaIndices.add(indice);
                i--;
            }
        }

        return listaCompleta;
    }

    public String formataPalavra(String palavra) {

        this.palavraFormada = palavraFormada + palavra;

        return this.palavraFormada;

    }

    public boolean verificarPalavra() {
        boolean palavraVerificada;

        if (listaPalavras.contains(this.palavraFormada)) {
            palavraVerificada = true;
        } else {
            palavraVerificada = false;
        }

        this.palavraFormada = "";

        return palavraVerificada;

    }

}
