/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordetarefas;

import java.util.Scanner;

/**
 *
 * @author carmi
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        
        int opcao;
        
        do{
            System.out.println("\n--- GERENCIADOR DE TAREFAS ---");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Remover Tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1: 
                    System.out.print("Titulo da Tarefa: ");
                    String titulo = scanner.nextLine();
                    
                    System.out.print("Descricao: ");
                    String descricao = scanner.nextLine();
                    
                    Tarefa tarefa = new Tarefa(titulo, descricao);
                    gerenciador.adicionarTarefa(tarefa);
                    
                    System.out.println("Tarefa adicionada!");
                    break;
                    
                case 2:
                    gerenciador.listarTarefas();
                    break;
                    
                case 3:
                    System.out.print("Numero da tarefa para concluir: ");
                    int indexConcluir = scanner.nextInt();
                    gerenciador.concluirTarefa(indexConcluir);
                    System.out.println("Tarefa concluida!");
                    break;

                case 4:
                    System.out.print("Numero da tarefa para remover: ");
                    int indexRemover = scanner.nextInt();
                    gerenciador.removerTarefa(indexRemover);
                    System.out.println("Tarefa removida!");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        }while(opcao != 0);
        
        scanner.close();
    }
}
