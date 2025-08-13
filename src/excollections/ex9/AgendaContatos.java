package excollections.ex9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgendaContatos {
    private Map<String,String> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero) {
        agenda.put(nome,numero);
    }

    public void removerContato(String nome) {
        if (agenda.isEmpty()) return;
        agenda.remove(nome);
    }

    public void exibirContatos() {
        System.out.println("=== Agenda ===");
        System.out.printf("Contatos: %s\n\n",agenda.size());
        System.out.println(agenda);
    }

    public String pesquisarContato(String nome) {
        if (agenda.isEmpty()) return null;
        return agenda.get(nome);
    }
}
