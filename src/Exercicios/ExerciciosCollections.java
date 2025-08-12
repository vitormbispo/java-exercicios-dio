package Exercicios;

import excollections.ex1.ExerciciosCollections1;
import excollections.ex2.ExerciciosCollections2;
import excollections.ex5.ExerciciosCollections5;

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
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1-3) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> ExerciciosCollections1.RodarExercicio();
                case "2" -> ExerciciosCollections2.RodarExercicio();
                case "3" -> ExerciciosCollections5.RodarExercicio();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }

}
