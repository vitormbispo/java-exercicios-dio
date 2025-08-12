package excollections.ex2;

public class ExerciciosCollections2 {
    public static void RodarExercicio() {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("Café",10.90,2);
        carrinho.adicionarItem("Carne",25.60,4);
        carrinho.adicionarItem("Sabonete",3.20,5);
        carrinho.adicionarItem("Arroz",15.0,1);
        carrinho.adicionarItem("Feijão",7.50,2);

        carrinho.exibirItens();
        System.out.printf("\nO valor total da compra foi de: R$%.2f",carrinho.calcularValorTotal());
    }
}
