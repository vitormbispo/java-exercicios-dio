package exstream.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ExerciciosStream1 {
    public static void RodarExercicio() {
        System.out.println("=== Desafios: implementação de Streams ===\n");
        System.out.println("Descrições completas em: https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api");
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("\n=== Desafio 1===\n");
        numeros.stream().sorted().forEach((n)->System.out.print(n+"|"));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 2 ===\n");
        System.out.println(numeros.stream().filter(n -> n%2 ==0).reduce(0,Integer::sum));

        System.out.println("==================================");

        System.out.println("\n=== Desafio 3 ===\n");
        System.out.println(numeros.stream().reduce(true,(acc, n) -> acc && (n > 0),(p1,p2) -> p1 && p2));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 4 ===\n");
        numeros.stream().filter(n -> n%2 ==0).forEach((n)->System.out.print(n+"|"));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 5 ===\n");
        final List<Integer> maioresCinco = numeros.stream().filter(n -> n > 5).toList();
        System.out.println(maioresCinco.stream().reduce(0,Integer::sum)/maioresCinco.size());

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 6 ===\n");
        System.out.println(numeros.stream().reduce(false,(acc,n) -> acc || (n > 10), (p1,p2)->p1 || p2));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 7 ===\n");
        System.out.println(numeros.stream().sorted().toList().reversed().get(1));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 8 ===\n");
        System.out.println(numeros.stream().reduce(0,Integer::sum));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 9 ===\n");
        System.out.println(numeros.stream().distinct().toList().size() == numeros.size());

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 10 ===\n");
        numeros.stream().filter(n -> n % 2 == 1).filter(n -> n%3 == 0 || n%5 == 0).forEach(n -> System.out.printf("%s|",n));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 11 ===\n");
        System.out.println(numeros.stream().map(n -> n*n).reduce(0,Integer::sum));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 12 ===\n");
        System.out.println(numeros.stream().reduce(1,(x1,x2)->x1*x2));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 13 ===\n");
        final int INICIO = 5;
        final int FIM = 10;
        numeros.stream().filter(n -> (n >= INICIO) && (n <= FIM)).forEach(n -> System.out.printf("%s|",n));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 14 ===\n");
        Function<Integer,Boolean> ehPrimo = (n) -> {
          int quantDivisores = 0;
          for(int i = 1; i <= n;i++) {
              if(n%i == 0) quantDivisores++;
          }
          return quantDivisores == 2;
        };
        System.out.println(numeros.stream().filter(ehPrimo::apply).max(Integer::compareTo).get());

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 15 ===\n");
        System.out.println(numeros.stream().reduce(false,(acc,n)->acc || (n < 0),(n1,n2) -> n1 || n2));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 16 ===\n");
        System.out.println("# - Pares: ");
        numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.printf("%s|",n));
        System.out.println("\n# - Ímpares: ");
        numeros.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.printf("%s|",n));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 17 ===\n");
        numeros.stream().filter(ehPrimo::apply).forEach(n -> System.out.printf("%s|",n));

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 18 ===\n");

        System.out.println(numeros.stream().distinct().toList().size() == 1);

        System.out.println("\n\n==================================");

        System.out.println("\n=== Desafio 19 ===\n");
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0,Integer::sum));
    }
}
