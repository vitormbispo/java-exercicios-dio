package exinterfaces.ex1;

public class WhatsApp implements Mensageiro{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.printf("Enviando mensagem por WhatsApp: %s\n",mensagem);
    }
}
