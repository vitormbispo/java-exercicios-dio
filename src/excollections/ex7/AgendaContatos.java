package excollections.ex7;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, String numero) {
        agenda.add(new Contato(nome,numero));
    }

    public void removerContato(String nome) {
        agenda.removeIf(c -> c.getNome().equals(nome));
    }

    public void exibirContatos() {
        System.out.println("=== Agenda ===");
        System.out.printf("Contatos: %s\n\n",agenda.size());
        agenda.forEach(c -> System.out.println(c.toString()));
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<Contato>();
        for(Contato c : agenda) {
            if(c.getNome().startsWith(nome)) contatosEncontrados.add(c);
        }
        return contatosEncontrados;
    }

    public void atualizarContato(String nome, String novoNumero) {
        for(Contato c : agenda) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                break;
            }
        }
    }
}
