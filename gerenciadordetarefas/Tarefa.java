/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordetarefas;

/**
 *
 * @author carmi
 */
public class Tarefa {

    private String titulo;
    private String descricao;
    private boolean concluida;

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus() {
        return concluida;
    }

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void marcarComoConcluido() {
        this.concluida = true;
    }

    public void marcarComoPendente() {
        this.concluida = false;
    }

    public String getTarefaFormatada() {
        String textoStatus;

        if (concluida) {
            textoStatus = "CONCLUIDA";
        } else {
            textoStatus = "PENDENTE";
        }

        return titulo + " - " + textoStatus;

    }

}
