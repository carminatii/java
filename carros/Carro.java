/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

import java.time.Year;

/**
 *
 * @author alunolab13
 */
public class Carro {

    private String marca, modelo;
    private Year ano;
    double velocidade;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Year getAno() {
        return ano;
    }

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = Year.of(ano);
    }
}
