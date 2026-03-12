/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordeprodutos;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Bebida b1 = new Bebida(15, "Guarana", 9, 10);
        System.out.println(b1.getCodigo() + " " + b1.getNome() + " " + b1.getValor() + " " + b1.getQuantidadeEstoque());
    }
}
