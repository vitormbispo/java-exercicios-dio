package exinterfaces.ex1;

import java.util.Scanner;

public class ExerciciosInterfaces1 {
    public static void RodarExercicio() {
        String mensagem;
        int mensageiroEscolhido;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("=== Enviar mensagem ===");
            System.out.println("\nDigite sua mensagem (Ou \"sair\" para sair)->   ");

            mensagem = scan.nextLine();
            if(mensagem.equals("sair")) break;

            System.out.println("""
                    Escolha o mensageiro para enviar:
                    1) SMS
                    2) E-mail
                    3) WhatsApp
                    4) Redes Sociais
                    """);
            System.out.print("Escolha ->   ");
            mensageiroEscolhido = scan.nextInt(); scan.nextLine();

            switch (mensageiroEscolhido) {
                case 1 -> new SMS().enviarMensagem(mensagem);
                case 2 -> new Email().enviarMensagem(mensagem);
                case 3 -> new WhatsApp().enviarMensagem(mensagem);
                case 4 -> new RedesSociais().enviarMensagem(mensagem);
            }

        } while (true);
        System.out.println("Finalizado.");
    }
}
