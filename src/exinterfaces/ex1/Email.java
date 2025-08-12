package exinterfaces.ex1;

public class Email implements Mensageiro{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.printf("Enviando mensagem por WhatsApp: %s\n",mensagem);
    }
}
