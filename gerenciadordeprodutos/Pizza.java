/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordeprodutos;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author alunolab13
 */
public class Pizza extends Produto{
    private String tamanho;
    private int diametro;
    private List<String> ingredientes;

    public Pizza(String tamanho, int diametro, List<String> ingredientes, int codigo, String nome, double valor) {
        super(codigo, nome, valor);
        this.tamanho = tamanho;
        this.diametro = diametro;
        this.ingredientes = ingredientes;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getDiametro() {
        return diametro;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
    
    
    
    
}
