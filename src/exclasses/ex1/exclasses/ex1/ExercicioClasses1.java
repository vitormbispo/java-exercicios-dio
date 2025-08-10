package exclasses.ex1.exclasses.ex1;

import exclasses.ex1.ContaBancaria;
import exclasses.ex1.exclasses.ex1.exception.ContaInexistenteException;
import exclasses.ex1.exclasses.ex1.exception.SaldoInsuficienteException;

import java.util.Scanner;

public class ExercicioClasses1 {
    private static final Scanner scan = new Scanner(System.in);

    public static void RodarExercicio(){
        System.out.println("=== Exercício 1 ===");
        int opcao = 0;
        ContaBancaria conta = null;

        while (opcao != 8) {
            System.out.println("===============================================================");
            System.out.println("=== Banco Java ===");
            System.out.println("Seja bem-vindo! Escolha uma operação: ");
            System.out.println("1) Criar conta\n2) Consultar saldo\n3) Consultar cheque especial\n4) Depósito\n5) Saque\n6) Pagar boleto\n7) Estou no cheque especial?\n8) Sair");

            do {
                System.out.print("Sua escolha: ");
                opcao = scan.nextInt();
                if(opcao < 1 || opcao > 8) System.out.println("Entrada inválida!");
            } while (opcao < 1 || opcao > 8);

            switch (opcao) {
                case 1 -> conta = criarConta();
                case 2 -> {
                    try {
                        ConsultarSaldo(conta);
                    } catch (ContaInexistenteException e){
                        System.out.println("\nErro: "+e.getMessage()+"\n");
                    }
                }
                case 3 -> {
                    try {
                        ConsultarChequeEspecial(conta);
                    } catch (ContaInexistenteException e){
                        System.out.println("\nErro: "+e.getMessage()+"\n");
                    }
                }
                case 4 -> {
                    try {
                        Depositar(conta);
                    } catch (ContaInexistenteException e){
                        System.out.println("\nErro: "+e.getMessage()+"\n");
                    }
                }
                case 5 -> {
                    try {
                        Sacar(conta);
                    } catch (ContaInexistenteException e){
                        System.out.println("\nErro: "+e.getMessage()+"\n");
                    }
                }
                case 6 -> {
                    try {
                        PagarBoleto(conta);
                    } catch (ContaInexistenteException e){
                        System.out.println("\nErro: "+e.getMessage()+"\n");
                    }
                }
                case 7 -> {
                    try {
                        VerificarChequeEspecial(conta);
                    } catch (ContaInexistenteException e){
                        System.out.println("\nErro: "+e.getMessage()+"\n");
                    }
                }
            }
        }
        System.out.println("\n\n-> Encerrando... \n\n");
    }

    private static ContaBancaria criarConta() {
        System.out.println("=== Criação de conta ===");
        System.out.print("Insira o saldo inicial da sua nova conta (ex.: 1550,10): ");
        float depositoInicial = scan.nextFloat();
        System.out.println("Conta criada com sucesso.");
        return new ContaBancaria(depositoInicial);
    }
    private static void ConsultarSaldo(ContaBancaria conta) throws ContaInexistenteException{
        if(conta == null) throw new ContaInexistenteException("Você ainda não criou uma conta!");
        conta.ConsultarSaldo();
    }
    private static void ConsultarChequeEspecial(ContaBancaria conta) throws ContaInexistenteException{
        if(conta == null) throw new ContaInexistenteException("Você ainda não criou uma conta!");
        conta.ConsultarChequeEspecial();
    }
    private static void Depositar(ContaBancaria conta) throws ContaInexistenteException{
        if(conta == null) throw new ContaInexistenteException("Você ainda não criou uma conta!");
        System.out.println("=== Depósito ===");
        System.out.print("Insira o valor do depósito:   ");
        float valor = scan.nextFloat();
        conta.Depositar(valor);
        System.out.println("Operação concluída.");
    }

    private static void Sacar(ContaBancaria conta) throws ContaInexistenteException{
        if(conta == null) throw new ContaInexistenteException("Você ainda não criou uma conta!");
        System.out.println("=== Saque ===");
        System.out.print("Insira o valor do saque:   ");
        float valor = scan.nextFloat();
        try {
            conta.Sacar(valor);
        } catch (SaldoInsuficienteException e){
            System.out.println("Erro: "+e.getMessage());
        }
        System.out.println("Operação concluída.");
    }
    private static void PagarBoleto(ContaBancaria conta) throws ContaInexistenteException{
        if(conta == null) throw new ContaInexistenteException("Você ainda não criou uma conta!");
        System.out.println("=== Pagamento de boleto ===");
        System.out.print("Insira o valor do boleto:   ");
        float valor = scan.nextFloat();
        try {
            conta.PagarBoleto(valor);
        } catch (SaldoInsuficienteException e){
            System.out.println("Erro: "+e.getMessage());
        }
        System.out.println("Operação concluída.");
    }

    private static void VerificarChequeEspecial(ContaBancaria conta) throws ContaInexistenteException{
        if(conta == null) throw new ContaInexistenteException("Você ainda não criou uma conta!");
        String mensagem = conta.VerificarChequeEspecial() ? "Você está no cheque especial." : "Você NÃO está no cheque especial.";
        System.out.printf("\n=== Estou no cheque especial? ===\n\n->%s\n\n",mensagem);
    }
}
