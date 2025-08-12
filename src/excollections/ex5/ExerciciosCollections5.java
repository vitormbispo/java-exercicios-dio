package excollections.ex5;

import java.util.List;

public class ExerciciosCollections5 {
    public static void RodarExercicio() {
        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();

        pessoas.adicionarPessoa("Vitor",19,1.75);
        pessoas.adicionarPessoa("Maria",23,1.54);
        pessoas.adicionarPessoa("Felipe",24,1.85);
        pessoas.adicionarPessoa("Larissa",14,1.47);
        pessoas.adicionarPessoa("Antônio",43,1.64);
        pessoas.adicionarPessoa("Lurdes",63,1.53);
        pessoas.adicionarPessoa("Vanessa",17,1.68);

        System.out.println("\n=== Ordenado por idade ===");
        List<Pessoa> porIdade = pessoas.ordenarPorIdade();
        for(int i = 0; i < porIdade.size();i++) {
            System.out.printf("%s) %s\n",i+1,porIdade.get(i).getNome());
        }

        System.out.println("\n=== Ordenado por altura ===");
        List<Pessoa> porAltura = pessoas.ordenarPorAltura();
        for(int i = 0; i < porAltura.size();i++) {
            System.out.printf("%s) %s\n",i+1,porAltura.get(i).getNome());
        }
    }
}
