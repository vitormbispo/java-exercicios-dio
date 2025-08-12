package exinterfaces.ex2;

public class Vestuario extends Produto{
    public Vestuario(float valor, String nome) {
        super(valor, nome);
    }

    @Override
    public float calcularTributos() {
        return super.valor * 0.025f;
    }

    @Override
    public float porcentagemTributos() {
        return 0.025f;
    }
}
