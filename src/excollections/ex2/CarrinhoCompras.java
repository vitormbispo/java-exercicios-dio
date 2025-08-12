package excollections.ex2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Item> carrinho;

    public CarrinhoCompras() {
        carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome,double preco,int quantidade) {
        carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome) {
        carrinho.removeIf(i -> i.getNome().equals(nome));
    }

    public double calcularValorTotal() {
        double subtotal = 0.0;
        for(Item i : carrinho) {
            subtotal += i.getPreco() * i.getQuantidade();
        }
        return subtotal;
    }

    public void exibirItens() {
        for(Item i : carrinho) {
            System.out.printf("""
                    
                    Item: %s
                    Preço: R$%.2f
                    Quantidade: %s
                    """,i.getNome(),i.getPreco(),i.getQuantidade());
        }
    }
}
