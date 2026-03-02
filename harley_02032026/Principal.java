/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.harley_02032026;
import java.util.Scanner;
/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a agência da conta 1: ");
        int agencia = scan.nextInt();
        
        System.out.println("Digite o número da conta 1: ");
        int numero = scan.nextInt();
        
        System.out.println("Digite o saldo inicial da conta 1: ");
        double saldo = scan.nextDouble();
        
        System.out.println("Digite o limite da conta 1: ");
        double limite = scan.nextDouble();
        
        
        Conta c1 = new Conta(agencia,numero,saldo,limite);
        Conta c2 = new Conta(345,888,1000,800);
        
        c1.transferir(c2, 10000);

        System.out.println("Saldo conta 1: " + c1.getSaldoDisponivel());
        System.out.println("Saldo conta 2: " + c2.getSaldoDisponivel());
    }
}
