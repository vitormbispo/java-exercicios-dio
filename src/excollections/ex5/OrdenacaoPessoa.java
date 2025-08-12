package excollections.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoas;
    public OrdenacaoPessoa() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(pessoas);
        Collections.sort(ordenadoPorIdade);
        return ordenadoPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(pessoas);
        ordenadoPorAltura.sort(new ComparatorPorAltura());
        return ordenadoPorAltura;
    }
}
