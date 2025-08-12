import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public  class Testes {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>(Arrays.asList(
                new Aluno("Vitor",1),
                new Aluno("Leo",2),
                new Aluno("Amanda",3),
                new Aluno("Beatriz",4)));
        alunos.forEach(aluno -> System.out.println(aluno.getNome()));
        Collections.sort(alunos);
        alunos.forEach(aluno -> System.out.println(aluno.getNome()));
    }

}

class Aluno implements Comparable<Aluno>{
    private String nome;
    private int ra;
    public Aluno(String nome,int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareTo(o.nome);
    }
}