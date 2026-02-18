/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.harley09022026;

import java.util.Scanner;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Harley";
        p1.idade = 21;

        System.out.println(p1.imprimir());
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Carminati";
        p2.idade = 23;
        
        System.out.println(p2.imprimir());
        
        Pessoa p3 = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        p3.nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        p3.idade = scanner.nextInt();
        
        System.out.println(p3.imprimir());
        scanner.close();
    }
}
  