package exheranca.ex1;

public class IngressoMeia extends Ingresso{
    public IngressoMeia(float valor, String filme,TipoFilme tipoFilme) {
        super(valor,filme,tipoFilme);
    }

    @Override
    public float getValor() {
        return super.getValor()/2;
    }
    @Override
    public void exibirIngresso() {
        System.out.println("\n== Ingresso meia entrada ==");
        System.out.printf("\n-> Valor do ingresso: %s\n",this.getValor());
        System.out.printf("-> Nome do filme: %s\n",this.getFilme());
        System.out.printf("-> Dublado/Legendado: %s\n",this.getTipoFilme().toString());
    }
}
