package exinterfaces.ex1;

public class RedesSociais implements Mensageiro{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.printf("Enviando mensagem pelas Redes Sociais: %s\n",mensagem);
    }
}
