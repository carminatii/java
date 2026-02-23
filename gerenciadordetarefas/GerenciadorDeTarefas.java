/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordetarefas;

import java.util.ArrayList;

/**
 *
 * @author carmi
 */
public class GerenciadorDeTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i).getTarefaFormatada());
        }
    }

    public void concluirTarefa(int index) {
        tarefas.get(index).marcarComoConcluido();
    }

    public void removerTarefa(int index) {
        tarefas.remove(index);
    }
}
