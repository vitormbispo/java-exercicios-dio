package Exercicios;

import exinterfaces.ex1.ExerciciosInterfaces1;
import exinterfaces.ex2.ExerciciosInterfaces2;

import java.util.Scanner;

public class ExerciciosInterfaces {
    public static void main(String[] args) {
        String opcao;
        do {
            System.out.println("\n=== Exercícios de Interfaces: ===");
            System.out.println("- Descrições detalhadas em: github.com/digitalinnovationone/exercicios-java-basico/blob/main/exercicios");
            System.out.println("\n1) Enviar mensagem");
            System.out.println("2) Calcular impostos");
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1-2) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> ExerciciosInterfaces1.RodarExercicio();
                case "2" -> ExerciciosInterfaces2.RodarExercicio();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }

}
