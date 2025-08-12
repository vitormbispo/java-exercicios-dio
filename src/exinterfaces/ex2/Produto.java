package exinterfaces.ex2;

public abstract class Produto implements Tributado{
    float valor;
    String nome;

    public Produto(float valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public abstract float calcularTributos();

    @Override
    public abstract float porcentagemTributos();

    @Override
    public void informarTributos() {
        System.out.printf("""
                == Informe dos tributos ==
                Produto: %s
                Valor base: %.2f
                Porcentagem dos tributos: %s
                Valor dos tributos: %.2f
                Valor total:%.2f
                ==========================
                """,this.nome,this.valor,this.porcentagemTributos(),this.calcularTributos(),this.calcularTributos()+this.valor);
    }
}
