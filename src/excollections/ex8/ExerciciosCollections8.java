package excollections.ex8;

public class ExerciciosCollections8 {
    public static void RodarExercicio() {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarItem("Café",1,10.90,2);
        produtos.adicionarItem("Carne",2,25.60,4);
        produtos.adicionarItem("Chocolate",10,3.21,5);
        produtos.adicionarItem("Sabonete",3,3.20,5);
        produtos.adicionarItem("Arroz",4,15.0,1);
        produtos.adicionarItem("Feijão",5,7.50,2);
        produtos.adicionarItem("Café",6,13.50,1);
        produtos.adicionarItem("Carne de Porco",2,11.20,1);

        produtos.exibirItens();

        System.out.println("\n=== Ordenado por nome ===\n");
        produtos.cadastrosPorNome().forEach(p -> System.out.println(p.toString()));

        System.out.println("\n=== Ordenado por preço ===\n");
        produtos.cadastrosPorPreco().forEach(p -> System.out.println(p.toString()));
    }
}
