package exheranca.ex1;

public class Ingresso {
    private final float valor;
    private final String filme;
    private final TipoFilme tipoFilme;

    public Ingresso(float valor,String filme, TipoFilme tipoFilme) {
        this.valor = valor;
        this.filme = filme;
        this.tipoFilme = tipoFilme;
    }

    public float getValor() {
        return this.valor;
    }

    public String getFilme() {
        return this.filme;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void exibirIngresso() {
        System.out.println("\n== Ingresso ==");
        System.out.printf("\n-> Valor do ingresso: %s\n",valor);
        System.out.printf("-> Nome do filme: %s\n",filme);
        System.out.printf("-> Dublado/Legendado: %s\n",tipoFilme.toString());
    }
}
