package exheranca.ex1;

import java.util.Scanner;

public class ExerciciosHeranca1 {
    private static final Scanner scan = new Scanner(System.in);
    public static void RodarExercicio() {
        int opcao;
        do {
            do {
                System.out.println("\n=== Compre seu ingresso ===");
                System.out.println("1) Comprar individual");
                System.out.println("2) Comprar meia entrada");
                System.out.println("3) Comprar ingresso família");
                System.out.println("4) Sair");

                System.out.print("Sua escolha ->   ");
                opcao = scan.nextInt(); scan.nextLine();
                if (opcao < 1 || opcao > 4) System.out.println("Opção inválida!");
            } while (opcao < 1 || opcao > 4);

            switch (opcao) {
                case 1 -> {
                    comprarIngresso("individual").exibirIngresso();
                    System.out.println("\nIngresso comprado com sucesso.\n");
                }
                case 2 -> {
                    comprarIngresso("meia entrada").exibirIngresso();
                    System.out.println("\nIngresso comprado com sucesso.\n");
                }
                case 3 -> {
                    comprarIngresso("família").exibirIngresso();
                    System.out.println("\nIngresso comprado com sucesso.\n");
                }
            }

        } while (opcao != 4);
        System.out.println("Saindo...");
    }

    public static Ingresso comprarIngresso(String tipo) {
        System.out.printf("=== Comprando ingresso %s ===\n",tipo);

        System.out.print("Qual o valor do ingresso?   ");
        float valor = scan.nextFloat(); scan.nextLine();

        System.out.print("Qual o nome do filme?   ");
        String filme = scan.nextLine();

        System.out.print("Dublado ou legendado?   ");
        TipoFilme tipoFilme = null;
        String entrada;
        do {
            entrada = scan.nextLine().toUpperCase();
            if (!entrada.equals("DUBLADO") && !entrada.equals("LEGENDADO")) {
                System.out.println("Opção inválida!");
                continue;
            }
            tipoFilme = TipoFilme.valueOf(entrada);
        } while (!entrada.equals("DUBLADO") && !entrada.equals("LEGENDADO"));


        if(tipo.equals("família")) {
            System.out.print("Quantos familiares?   ");
            int tamFamilia = scan.nextInt(); scan.nextLine();
            return new IngressoFamilia(valor,filme,tipoFilme,tamFamilia);
        }

        return tipo.equals("meia entrada") ? new IngressoMeia(valor,filme,tipoFilme) : new Ingresso(valor,filme,tipoFilme);
    }
}
