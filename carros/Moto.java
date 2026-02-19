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
public class Moto {
    private String marca, modelo;
    private Year ano;
    double velocidade;
    
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public Year getAnoFabricacao(){return ano;} 
    
    public void setMarca(String marca){this.marca = marca;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setAno(int ano){this.ano = Year.of(ano);}  
}
