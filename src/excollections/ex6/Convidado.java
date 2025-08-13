package excollections.ex6;

public class Convidado {
    String nome;
    int codigo;

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format("%s#%s",nome,codigo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Convidado convidado = (Convidado) o;
        return codigo == convidado.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
