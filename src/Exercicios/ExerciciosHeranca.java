package Exercicios;

import exheranca.ex1.ExerciciosHeranca1;

import java.util.Scanner;

public class ExerciciosHeranca {
    public static void main(String[] args) {
        String opcao;
        do {
            System.out.println("\n=== Exercícios de Classes e encapsulamento: ===");
            System.out.println("- Descrições detalhadas em: github.com/digitalinnovationone/exercicios-java-basico/blob/main/exercicios");
            System.out.println("\n1) Ingressos de cinema");
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> ExerciciosHeranca1.RodarExercicio();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }

}
