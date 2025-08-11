package Exercicios;

import java.util.Scanner;

public class ExerciciosEstruturasDeControle {
    /**
     * Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
     */
    public static void Exercicio1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Gerador de tabuadas ===");
        System.out.print("Digite um número:   ");
        int num = scan.nextInt();
        scan.nextLine();

        for(int i = 1; i <= 10; i++) {
            System.out.printf("\n%s X %s = %s",num,i,num*i);
        }
        System.out.println("\nSucesso!");
    }

    /**
     * Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
     *
     * <ul>
     *   <li>Se for menor ou igual a 18,5 "Abaixo do peso";</li>
     *   <li>Se for entre 18,6 e 24,9 "Peso ideal";</li>
     *
     *    <li>Se for entre 25,0 e 29,9 "Levemente acima do peso";</li>
     *    <li>Se for entre 30,0 e 34,9 "Obesidade Grau I";</li>
     *    <li>Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";</li>
     *    <li>Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";</li>
     * </ul>
     *
     */
    public static void Exercicio2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Calculadora de IMC ===");

        System.out.print("\nInsira seu peso:   ");
        float peso = scan.nextFloat();
        scan.nextLine();

        System.out.print("Insira sua altura:   ");
        float altura = scan.nextFloat();
        scan.nextLine();

        float imc = peso/(altura*altura);
        String resultado = "";

        if(imc <= 18.5f) {
            resultado = "Abaixo do peso";
        }
        else if (imc > 18.5f && imc < 25.0f) {
            resultado = "Peso ideal";
        }
        else if (imc >= 25.0f && imc < 30.0f) {
            resultado = "Levemente acima do peso";
        }
        else if (imc >= 30.0f && imc < 35.0f) {
            resultado = "Obesidade Grau I";
        }
        else if (imc >= 35.0f && imc < 40.0f) {
            resultado = "Obesidade Grau II (Severa)";
        }
        else if (imc >= 40.0f) {
            resultado = "Obesidade III (Mórbida)";
        }

        System.out.printf("Seu IMC é de %s: %s",imc,resultado);
    }

    /**
     * Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
     */
    public static void Exercicio3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n=== Exibe pares/impares ===");

        int inicio;
        int fim;
        do {
            System.out.println("Digite um intervalo numérico: ");
            System.out.print("Início:   ");
            inicio = scan.nextInt();
            scan.nextLine();

            System.out.print("Fim:   ");
            fim = scan.nextInt();
            scan.nextLine();

            if(inicio > fim) System.out.println("Intervalo inválido! O fim deve ser maior que o início");
        } while (inicio > fim);

        String opcao;
        do {
            System.out.print("Exibir números pares ou ímpares? (p/i)   ");
            opcao = scan.nextLine();

            if(!opcao.equalsIgnoreCase("p") && !opcao.equalsIgnoreCase("i")) System.out.println("Entrada inválida!");
        } while (!opcao.equalsIgnoreCase("p") && !opcao.equalsIgnoreCase("i"));


        boolean mostrarPares = opcao.equalsIgnoreCase("p");
        for(int i = fim; i >= inicio; i--) {
            if((mostrarPares && i%2 == 0) || (!mostrarPares && i%2 != 0)) {
                System.out.println(i);
            }
        }
        System.out.println("Fim.");
    }

    /**
     * Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
     */
    public static void Exercicio4() {
        System.out.println("\n=== Múltiplos ===");
        System.out.print("Escolha um número inteiro inicial *N*:   ");
        Scanner scan = new Scanner(System.in);
        int inicial = scan.nextInt();
        scan.nextLine();
        int prox = 0;

        do {
            System.out.println("Digite um número inteiro múltiplo de *N* maior que *N*");
            int entrada  = scan.nextInt();
            scan.nextLine();
            if(entrada < inicial) continue;
            prox = entrada;
        } while (prox % inicial == 0);
        
        System.out.printf("\n%s não é múltiplo de %s! Programa encerrado.",prox,inicial);
    }
    public static void main(String[] args) {
        System.out.println("\n=== Exercícios de Estruturas de Controle: ===");
        System.out.println("\n1) Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;");
        System.out.println("""
                
                2) Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
                - Se for menor ou igual a 18,5 "Abaixo do peso";
                - Se for entre 18,6 e 24,9 "Peso ideal";
                - Se for entre 25,0 e 29,9 "Levemente acima do peso";
                - Se for entre 30,0 e 34,9 "Obesidade Grau I";
                - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
                - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";""");
        System.out.println("\n3) Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro\n e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares \n(de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;");
        System.out.println("\n4) Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,\n a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, \nnúmeros menores que o primeiro número devem ser ignorados");


        String opcao;
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


