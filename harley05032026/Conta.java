/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.harley05032026;

/**
 *
 * @author alunolab13
 */
public class Conta {
    private int agencia, numero;
    private double saldo, limite;

    public Conta(int agencia, int numero, double saldo, double limite) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta() {

    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public double getSaldoDisponivel() {
        return saldo + limite;
    }

    public boolean debitar(double valor) {
        if (valor <= getSaldoDisponivel()) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.debitar(valor)) {
            destino.creditar(valor);
            return true;
        } else {
            System.out.println("Tranferencia não foi concluida!");
            return false;
        }
    } 
}
