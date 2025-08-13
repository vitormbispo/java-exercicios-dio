package Exercicios;

import excollections.ex1.ExerciciosCollections1;
import excollections.ex2.ExerciciosCollections2;
import excollections.ex5.ExerciciosCollections5;
import excollections.ex6.ExerciciosCollections6;
import excollections.ex7.ExerciciosCollections7;
import excollections.ex8.ExerciciosCollections8;
import excollections.ex9.ExerciciosCollections9;

import java.util.Scanner;

public class ExerciciosCollections {
    public static void main(String[] args) {
        String opcao;
        do {
            System.out.println("\n=== Exercícios de Collections: ===");
            System.out.println("- Descrições detalhadas em: https://github.com/cami-la/collections-java-api-2023/blob/master/out/production/collections-java-api-2023/main/java/list/README.md");
            System.out.println("\n1) Lista de tarefas");
            System.out.println("2) Carrinho de compras");
            System.out.println("3) Ordenando pessoas");
            System.out.println("4) Ingressos de convidados");
            System.out.println("5) Agenda de contatos");
            System.out.println("6) Cadastro de produtos");
            System.out.println("7) Agenda com map");
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1-6) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> ExerciciosCollections1.RodarExercicio();
                case "2" -> ExerciciosCollections2.RodarExercicio();
                case "3" -> ExerciciosCollections5.RodarExercicio();
                case "4" -> ExerciciosCollections6.RodarExercicio();
                case "5" -> ExerciciosCollections7.RodarExercicio();
                case "6" -> ExerciciosCollections8.RodarExercicio();
                case "7" -> ExerciciosCollections9.RodarExercicio();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }

}
