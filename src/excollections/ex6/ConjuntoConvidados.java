package excollections.ex6;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        this.conjuntoConvidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int numero) {
        Convidado convidado = new Convidado(nome,numero);
        conjuntoConvidados.add(convidado);
    }

    public void removerConvidado(int codigo) {
        conjuntoConvidados.removeIf(c -> c.getCodigo() == codigo);
    }

    public void exibirCandidatos() {
        conjuntoConvidados.forEach(c -> System.out.println(c.toString()));
    }
}
