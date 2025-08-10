package Exercicios;

import exclasses.ex1.ContaBancaria;
import exclasses.ex1.exclasses.ex1.ExercicioClasses1;
import exclasses.ex1.exclasses.ex1.exception.ContaInexistenteException;
import exclasses.ex1.exclasses.ex1.exception.SaldoInsuficienteException;

import java.util.Scanner;

public class ExerciciosClasses {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String opcao = "";
        do {
            System.out.println("=== Exercícios de Classes e encapsulamento: ===");
            System.out.println("\n1) Simulação de conta bancária.");
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1-4) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> ExercicioClasses1.RodarExercicio();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }

}
