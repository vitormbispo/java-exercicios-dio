//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Exercicios.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        boolean programaEncerrado = false;
        do {
            System.out.println("=== Lista de Exercícios Java DIO ===");

            System.out.println("\n\n1) Fundamentos de Java.");
            System.out.println("2) Estruturas de Controle.");
            System.out.println("3) Classes e Encapsulamento.");
            System.out.println("4) Encerrar aplicação.");
            System.out.print("\n Escolha um dos temas:   ");

            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> ExerciciosFundamentos.main(null);
                case 2 -> ExerciciosEstruturasDeControle.main(null);
                case 3 -> ExerciciosClasses.main(null);
                default -> programaEncerrado = true;
            }
        } while (!programaEncerrado);
        System.out.println("Encerrando aplicação...");
    }

}