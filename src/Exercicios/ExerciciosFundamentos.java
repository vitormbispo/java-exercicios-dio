package Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class ExerciciosFundamentos {
    public static void Exercicio1(){
        int anoBase = OffsetDateTime.now().getYear();
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 1 ===");

        System.out.println("Escreva seu nome:");
        String nome = scan.nextLine();

        System.out.println("Escreva seu ano de nascimento:");
        int ano = scan.nextInt();

        System.out.printf("Olá, %s! Você tem %s anos.",nome,anoBase-ano);
    }
    public static void Exercicio2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 2 ===");
        System.out.println("Calcula área de um quadrado!");
        System.out.println("Escreva a medida do lado:");

        float lado = scan.nextFloat();

        System.out.println("A área do seu quadrado é "+(lado*lado));

    }
    public static void Exercicio3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Exercicio 3 ===");
        System.out.println("Calcula área de um retângulo!");
        System.out.println("Escreva a altura:");

        float altura = scan.nextFloat();
        scan.nextLine();

        System.out.println("Escreva a largura");
        float largura = scan.nextFloat();
        System.out.println("A área do seu retângulo é "+(altura*largura));
    }

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

}
