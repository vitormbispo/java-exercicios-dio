import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public  class Testes {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>(Arrays.asList(
                new Aluno("Vitor",1),
                new Aluno("Leo",2),
                new Aluno("Amanda",3),
                new Aluno("Beatriz",4),
                new Aluno("Vitor Hugo",5),
                new Aluno("João Vitor",6),
                new Aluno("Caio Vitor",7)));
        Consumer<Aluno> cons = a -> System.out.println(a.getNome());
        alunos.forEach(cons);
        Collections.sort(alunos);
        alunos.forEach(cons);

        Supplier<String> supplier = () -> "Olá mundo!";
        List<String> mensagens = Stream.generate(supplier).limit(5).toList();

        mensagens.forEach(System.out::println);

        Function<Aluno,Integer> dobraRA = aluno -> aluno.getRa() * 2;
        List<Integer> raDobrado = alunos.stream().map(dobraRA).toList();
        raDobrado.forEach(System.out::println);



        BiFunction<String,Aluno,String> concatenarNomes = (acc,a1) -> String.format("%s|%s",acc,a1.getNome());
        Predicate<Aluno> ehVitor = aluno -> aluno.getNome().contains("Vitor");
        System.out.println(alunos.stream().filter(ehVitor).reduce("",concatenarNomes,(a1,a2)->a1+a2));
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