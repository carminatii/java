/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carros;

/**
 *
 * @author alunolab13
 */
public class Veiculo {

    public static void main(String[] args) {
        
        Carro c1 = new Carro("Ford", "Fiesta", 2010);
       
        
        
        
        
        System.out.println("O Carro é: " + c1.getMarca() + ", " + c1.getModelo() + ", " + c1.getAno() );
    }
}
