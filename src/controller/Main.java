package controller;
import model.Aluno;
import repository.RepositorioAluno;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RepositorioAluno repositorio = new RepositorioAluno();
        int opcao= -1;

        while(opcao!=0){
            System.out.println("=== SISTEMA DE ACADEMIA ===");
            System.out.println("1. Cadastra Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar Cadastro");
            System.out.println("4. Exculir Aluno ");
            System.out.println("0. Sair");
            System.out.print("Excolha uma opição: ");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite seu objetivo: ");
                    String objetivo = sc.nextLine();

                    Aluno novoAluno = new Aluno(nome, objetivo);
                    repositorio.criar(novoAluno);

                case 2:
                    repositorio.listar();
                    break;

                case 3:
                    repositorio.listar();
                    System.out.print("Digite o ID do aluno q voce quer alterar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o NOVO Nome do aluno: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Digite o NOVO Objetivo do aluno: ");
                    String novoObjetivo = sc.nextLine();

                    repositorio.atualizar(idAtualizar, novoNome, novoObjetivo);
                    break;
                case 4:
                    repositorio.listar();
                    System.out.print("Digite o ID do aluno que vc quer excluir: ");
                    int idExcluir = sc.nextInt();
                    sc.nextLine();
                    repositorio.excluir(idExcluir);
                    break;

                case 0:
                    System.out.println("saindo do Sistema... ");
                    break;

                default:
                    System.out.println("Opção invalida! Tente novamente.");

            }

        }

    }
}
