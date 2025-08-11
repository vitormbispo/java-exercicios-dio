package exheranca.ex1;

public class IngressoFamilia extends Ingresso{
    private final int tamFamilia;
    public IngressoFamilia(float valor, String nome, TipoFilme tipoFilme,int tamFamilia) {
        super(valor,nome,tipoFilme);
        this.tamFamilia = tamFamilia;
    }
    @Override
    public float getValor() {
        float valorTotal = (tamFamilia*super.getValor());
        float porcentagemDesconto = 0.1f;
        return  tamFamilia > 3 ? valorTotal - (valorTotal*porcentagemDesconto) : valorTotal;
    }

    @Override
    public void exibirIngresso() {
        System.out.println("\n== Ingresso família ==");
        System.out.printf("\n-> Valor do ingresso: %s\n",this.getValor());
        System.out.printf("-> Nome do filme: %s\n",this.getFilme());
        System.out.printf("-> Dublado/Legendado: %s\n",this.getTipoFilme().toString());
    }
}
