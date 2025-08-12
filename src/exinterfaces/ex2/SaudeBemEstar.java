package exinterfaces.ex2;

public class SaudeBemEstar extends Produto{
    public SaudeBemEstar(float valor, String nome) {
        super(valor, nome);
    }

    @Override
    public float calcularTributos() {
        return super.valor * 0.015f;
    }

    @Override
    public float porcentagemTributos() {
        return 0.015f;
    }
}
