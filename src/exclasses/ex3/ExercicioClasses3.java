package exclasses.ex3;

import java.util.Scanner;

public class ExercicioClasses3 {
    public static void RodarExercicio() {
        final PetShop petshop = new PetShop();
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("=== Exercício 3 ===");
        System.out.println("========================================================================");
        System.out.println("=== PetShop ===");
        System.out.println("1) Colocar pet na máquina");
        System.out.println("2) Retirar pet da máquina");
        System.out.println("3) Dar banho no pet");
        System.out.println("4) Verificar nível de água");
        System.out.println("5) Verificar nível de shampoo");
        System.out.println("6) Verificar se tem pet no banho");
        System.out.println("7) Abastecer com água");
        System.out.println("8) Abastecer com shampoo");
        System.out.println("9) Limpar máquina");
        System.out.println("10) Fechar petshop");
        do {
            do {
                System.out.print("\nSua escolha: ->   ");
                opcao = scan.nextInt();
                scan.nextLine();
                if(opcao < 1 || opcao > 10) System.out.println("Opção inválida!");
            } while ((opcao < 1 || opcao > 10));

            switch (opcao) {
                case 1 -> {
                    Pet pet = new Pet();
                    petshop.colocarPetMaquina(pet);
                }
                case 2 -> petshop.tirarPetMaquina();
                case 3 -> petshop.darBanho();
                case 4 -> System.out.printf("-> Nível de água: %s litros",petshop.verificarNivelAgua());
                case 5 -> System.out.printf("-> Nível de shampoo: %s litros",petshop.verificarNivelShampoo());
                case 6 -> {
                    String mensagem = petshop.petNoBanho() ? "\n-> Já tem um pet no banho." : "\n-> Ainda não tem nenhum pet no banho";
                    System.out.println(mensagem);
                }
                case 7 -> {
                    System.out.print("Abastecer com quantos litros de água? (Máximo 2 por vez)   ");
                    int quantia = scan.nextInt();
                    scan.nextLine();
                    petshop.abastecerAgua(quantia);
                }
                case 8 -> {
                    System.out.print("Abastecer com quantos litros de shampoo? (Máximo 2 por vez)   ");
                    int quantia = scan.nextInt();
                    scan.nextLine();
                    petshop.abastecerShampoo(quantia);
                }
                case 9 -> petshop.limparMaquina();
                case 10 -> {
                    if(petshop.petNoBanho()) System.out.println("Ainda tem um pet no banho! Tire ele da máquina antes de fechar.");
                    else System.out.println("Fechando...");
                }
            }
        }while (opcao != 10 || petshop.petNoBanho());
    }
}
