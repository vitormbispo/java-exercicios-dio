package exinterfaces.ex2;

import java.util.Scanner;

public class ExerciciosInterfaces2 {
    public static void RodarExercicio() {
        int opcao;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("=== Consultar imposto ===");

            System.out.println("""
                    Escolha um produto para consultar:
                    1) Batata
                    2) Arroz
                    3) Café
                    4) Feijão
                    5) Medicamentos
                    6) Vitaminas
                    7) Camiseta
                    8) Blusa
                    9) Ingresso para teatro
                    10) Ingresso parque de diversões
                    11) Sair
                    """);
            System.out.print("Escolha ->   ");
            opcao = scan.nextInt(); scan.nextLine();

            switch (opcao) {
                case 1 -> new Alimentacao(5.0f,"Batata").informarTributos();
                case 2 -> new Alimentacao(15.0f,"Arroz").informarTributos();
                case 3 -> new Alimentacao(20.0f,"Café").informarTributos();
                case 4 -> new Alimentacao(10.0f,"Feijão").informarTributos();
                case 5 -> new SaudeBemEstar(20.0f,"Medicamentos").informarTributos();
                case 6 -> new SaudeBemEstar(40.0f,"Vitaminas").informarTributos();
                case 7 -> new Vestuario(100.0f,"Camiseta").informarTributos();
                case 8 -> new Vestuario(200.0f,"Blusa").informarTributos();
                case 9 -> new Cultura(50.0f,"Ingresso para teatro").informarTributos();
                case 10 -> new Cultura(60.0f,"Ingresso parque de diversões").informarTributos();
                case 11 -> System.out.println("Saindo...");
            }
            if(opcao < 1 || opcao > 11) System.out.println("Entrada inválida!");
        } while (opcao != 11);
    }
}
