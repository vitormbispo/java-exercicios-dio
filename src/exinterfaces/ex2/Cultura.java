package exinterfaces.ex2;

public class Cultura extends Produto{
    public Cultura(float valor, String nome) {
        super(valor, nome);
    }

    @Override
    public float calcularTributos() {
        return super.valor * 0.04f;
    }

    @Override
    public float porcentagemTributos() {
        return 0.04f;
    }
}
