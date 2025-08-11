package exclasses.ex2;

import exclasses.ex2.exceptions.CarroDesligadoException;
import exclasses.ex2.exceptions.PontoNeutroException;
import exclasses.ex2.exceptions.PuloDeMarchasException;
import exclasses.ex2.exceptions.VelocidadeNaCurvaException;

import java.util.Scanner;

public class ExercicioClasses2 {
    public static void RodarExercicio() {
        final Carro carro = new Carro();
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("=== Exercício 2 ===");
        System.out.println("========================================================================");
        System.out.println("=== Controle do carro ===");
        System.out.println("1) Ligar carro");
        System.out.println("2) Desligar carro");
        System.out.println("3) Acelerar");
        System.out.println("4) Reduzir velocidade");
        System.out.println("5) Virar");
        System.out.println("6) Verificar velocidade");
        System.out.println("7) Verificar marcha");
        System.out.println("8) Trocar de marcha");
        System.out.println("9) Sair do carro");
        do {
            do {
                System.out.print("\nSua escolha: ->   ");
                opcao = scan.nextInt();
                scan.nextLine();
                if(opcao < 1 || opcao > 9) System.out.println("Opção inválida!");
            } while ((opcao < 1 || opcao > 9));

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> {
                    try {
                        carro.acelerar();
                        System.out.println("-> Acelerando...");
                    } catch (PontoNeutroException | CarroDesligadoException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        carro.diminuirVelocidade();
                        System.out.println("-> Reduzindo...");
                    } catch (CarroDesligadoException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    try {
                        String direcao;
                        do {
                            System.out.print("Virar para qual direção? (esquerda/direita)   ");
                            direcao = scan.nextLine().toLowerCase();
                            if(!direcao.equals("esquerda") && !direcao.equals("direita")) System.out.println("Direção inválida!");
                        } while (!direcao.equals("esquerda") && !direcao.equals("direita"));

                        carro.virar(direcao);
                    } catch (CarroDesligadoException | VelocidadeNaCurvaException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> carro.verificarVelocidade();
                case 7 -> carro.verificarMarcha();
                case 8 -> {
                    try {
                        int proxMarcha;
                        do {
                            System.out.print("Para qual marcha trocar? (0-6)   ");
                            proxMarcha = scan.nextInt();
                            scan.nextLine();
                            if(proxMarcha < 0 || proxMarcha > 6) System.out.println("Marcha inválida!");
                        } while (proxMarcha < 0 || proxMarcha > 6);
                        carro.trocarMarcha(proxMarcha);
                    }catch (CarroDesligadoException | PuloDeMarchasException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 9 -> {
                    if(!carro.estaLigado()) {
                        System.out.println("-> Saindo do carro...");
                    }
                    else System.out.println("-> Desligue o carro para sair!");
                }
            }
        }while (opcao != 9 || carro.estaLigado());
    }
}
