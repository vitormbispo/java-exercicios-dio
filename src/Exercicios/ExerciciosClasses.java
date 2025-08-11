package Exercicios;

import exclasses.ex1.ExercicioClasses1;
import exclasses.ex2.ExercicioClasses2;
import exclasses.ex3.ExercicioClasses3;

import java.util.Scanner;

public class ExerciciosClasses {
    public static void main(String[] args) {
        String opcao;
        do {
            System.out.println("\n=== Exercícios de Classes e encapsulamento: ===");
            System.out.println("- Descrições detalhadas em: github.com/digitalinnovationone/exercicios-java-basico/blob/main/exercicios");
            System.out.println("\n1) Simulação de conta bancária.");
            System.out.println("2) Operando um carro.");
            System.out.println("3) Simulação de petshop.");
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1-4) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> ExercicioClasses1.RodarExercicio();
                case "2" -> ExercicioClasses2.RodarExercicio();
                case "3" -> ExercicioClasses3.RodarExercicio();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }

}
