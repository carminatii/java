/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author alunolab01
 */
public class Conta {

    private double saldo, limite;
    private int agencia, numero;
    
    
    
    public void saldoLimite(double limite){
        this.limite = limite;       
        saldo = saldo + limite;
    }
   

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Conta() {

    }

    public Conta(int agencia, int numero, double valor) {
        this.agencia = agencia;
        this.numero = numero;
        creditar(valor);

    }

    public void creditar(double valor) {
        saldo = saldo + valor;
    }
    
    

    public void debitar(double valor) {
        saldo = saldo - valor;
        
        if((saldo - valor) < 0){    
            
            
        }
    }

    public void transferir(Conta destino, double valor) {
        debitar(valor);
        destino.creditar(valor);
    }

}
