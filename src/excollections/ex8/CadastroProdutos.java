package excollections.ex8;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> cadastros;

    public CadastroProdutos() {
        cadastros = new HashSet<Produto>();
    }

    public void adicionarItem(String nome,int codigo,double preco,int quantidade) {
        cadastros.add(new Produto(nome,codigo,preco,quantidade));
    }

    public void removerItem(String nome) {
        cadastros.removeIf(i -> i.getNome().equals(nome));
    }

    public double calcularValorTotal() {
        double subtotal = 0.0;
        for(Produto i : cadastros) {
            subtotal += i.getPreco() * i.getQuantidade();
        }
        return subtotal;
    }

    public void exibirItens() {
        System.out.println("\n=== Produtos ===\n");
        for(Produto i : cadastros) {
            System.out.println(i.toString());
        }
    }

    public Set<Produto> cadastrosPorNome() {
        return new TreeSet<Produto>(cadastros);
    }

    public Set<Produto> cadastrosPorPreco() {
        Set<Produto> organizado =  new TreeSet<Produto>(new OrganizarPorPreco());
        organizado.addAll(cadastros);
        return organizado;
    }
}
