package exinterfaces.ex2;

public class Alimentacao extends Produto{
    public Alimentacao(float valor, String nome) {
        super(valor, nome);
    }

    @Override
    public float calcularTributos() {
        return super.valor * 0.01f;
    }

    @Override
    public float porcentagemTributos() {
        return 0.01f;
    }
}
