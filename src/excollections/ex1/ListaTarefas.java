package excollections.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa> lista;

    public ListaTarefas() {
        lista = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        lista.add(novaTarefa);
    }

    public void removeTarefa(String descricao) {
        lista.removeIf(t -> t.getDescricao().equals(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return lista.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();
        for(Tarefa t : lista) descricoes.add(t.getDescricao());
        return descricoes;
    }
}
