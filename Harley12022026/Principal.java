/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.harley12022026;

import java.util.Scanner;
/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.creditar(1500);
        
        System.out.println("Saldo Total R$: " + c1.getSaldo());
        
        Conta c2 = new Conta();
        c2.creditar(1000);
        c2.debitar(200);
        
        System.out.println("Saldo Total R$: " + c2.getSaldo());
        
        Conta c3 = new Conta();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do deposito: ");
        c3.creditar(sc.nextDouble());
        System.out.println("Saldo Total R$: " + c3.getSaldo());
        sc.close();
                
    }
}
