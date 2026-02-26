/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(4182, 1280007, 1500, 2000);
        
        System.out.println("A conta 1: " + c1.getAgencia() + "  " + c1.getNumero() + " Saldo: " + c1.getSaldo() + " Limite " + c1.getLimite());
    }
}
