package exinterfaces.ex1;

public class SMS implements Mensageiro{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.printf("Enviando mensagem por SMS: %s\n",mensagem);
    }
}
