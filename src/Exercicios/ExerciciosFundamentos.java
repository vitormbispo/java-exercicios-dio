package Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExerciciosFundamentos {
    /**
     * Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
     */
    public static void Exercicio1(){
        int anoBase = OffsetDateTime.now().getYear();
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 1 ===");

        System.out.print("Escreva seu nome:   ");
        String nome = scan.nextLine();

        System.out.print("Escreva seu ano de nascimento:   ");
        int ano = scan.nextInt();
        scan.nextLine();
        System.out.printf("Olá, %s! Você tem %s anos.",nome,anoBase-ano);
    }

    /**
     * Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
     */
    public static void Exercicio2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 2 ===");
        System.out.println("Calcula área de um quadrado!");
        System.out.print("Escreva a medida do lado:   ");

        float lado = scan.nextFloat();

        System.out.println("A área do seu quadrado é "+(lado*lado));
    }

    /**
     * Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
     */
    public static void Exercicio3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 3 ===");
        System.out.println("Calcula área de um retângulo!");
        System.out.print("Escreva a altura:   ");

        float altura = scan.nextFloat();
        scan.nextLine();

        System.out.print("Escreva a largura:   ");
        float largura = scan.nextFloat();
        System.out.println("A área do seu retângulo é "+(altura*largura));
    }

    /**
     * Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
     */
    public static void Exercicio4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 4 ===");
        System.out.print("Escreva o nome da pessoa 1:   ");
        String nome1 = scan.nextLine();
        System.out.print("Escreva a idade da pessoa 1:   ");
        int idade1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Escreva o nome da pessoa 2:   ");
        String nome2 = scan.nextLine();
        System.out.print("Escreva a idade da pessoa 2:    ");
        int idade2 = scan.nextInt();

        System.out.printf("\nA diferença de idade entre %s e %s é de %s anos!",nome1,nome2,Math.abs(idade1-idade2));
    }

    public static void main(String[] args) {
        System.out.println("=== Exercícios de Fundamentos do Java: ===");
        System.out.println("\n1) Escreva um código que receba o nome e o ano de nascimento de alguém \ne imprima na tela a seguinte mensagem: \"Olá 'Fulano' você tem 'X' anos\".");
        System.out.println("\n2) Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.");
        System.out.println("\n3) Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela.");
        System.out.println("\n4) Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.");


        String opcao = "";
        do {
            System.out.print("\n\n (?) - Qual exercício você quer rodar?(1-4) (digite \"sair\" para encerrar)  ");
            Scanner scan = new Scanner(System.in);
            opcao = scan.nextLine();

            switch (opcao) {
                case "1" -> Exercicio1();
                case "2" -> Exercicio2();
                case "3" -> Exercicio3();
                case "4" -> Exercicio4();
                case "sair" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }while (!opcao.equals("sair"));
    }
}
