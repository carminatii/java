/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.harley05032026;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author alunolab13
 */
public class Principal extends Conta {

    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agência da conta " + (i + 1) + ": "));

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta " + (i + 1) + ": "));

            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta " + (i + 1) + ": "));

            double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta " + (i + 1) + ": "));

            Conta c = new Conta(agencia, numero, saldo, limite);

            contas.add(c);
        }

        Conta c1 = contas.get(0);
        Conta c2 = contas.get(1);

        c1.transferir(c2, 10000);

        JOptionPane.showMessageDialog(null, c1.getSaldoDisponivel());
        JOptionPane.showMessageDialog(null, c2.getSaldoDisponivel());
    }
}
