/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordeprodutos;

/**
 *
 * @author alunolab13
 */
public class Bebida extends Produto {

    private int quantidadeEstoque;

    public Bebida(int codigo, String nome, double valor, int quantidadeEstoque) {
        super(codigo, nome, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void darEntrada(int quantidade) {
        if (quantidade > 0) {
            quantidade += this.quantidadeEstoque;
            System.out.println("Entrada realizada com sucesso");
        } else {
            System.out.println("Entrada não foi realizada");
        }
    }

    public void darSaida(int quantidade) {
        if (quantidade > 0) {
            quantidade -= this.quantidadeEstoque;
            System.out.println("Saida realizada com sucesso");
        } else {
            System.out.println("Saida não foi realizada");
        }
    }
}
