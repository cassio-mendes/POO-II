package listaRevisaoP2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ExerciciosLambda {

    static void main() {
        System.out.print("Exercício 1: ");
        BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
        System.out.println(soma.apply(5, 5));

        System.out.println("\nExercício 2: ");
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("A string 'teste' é vazia: " + isEmpty.test("teste"));

        System.out.println("\nExercício 3: ");
        UnaryOperator<List<String>> maiusculas = l -> {
            List<String> result = new ArrayList<>();

            for(String s : l) result.add(s.toUpperCase());
            return result;
        };

        UnaryOperator<List<String>> minusculas = l -> {
            List<String> result = new ArrayList<>();

            for(String s : l) result.add(s.toLowerCase());
            return result;
        };

        List<String> list = List.of("Marcelo", "Maria", "João");
        System.out.println("Normal: " + list);
        System.out.println("Maiúsculas: " + maiusculas.apply(list));
        System.out.println("Minúsculas: " + minusculas.apply(list));

        System.out.println("\nExercício 4:");
        UnaryOperator<List<String>> ordemAlfabetica = l -> {
            l.sort(String::compareTo);
            return l;
        };

        List<String> strings = new ArrayList<>();
        strings.add("Tecnologia");
        strings.add("Análise");
        strings.add("Informação");

        System.out.println("Antes: " + strings);
        System.out.println("Depois: " + ordemAlfabetica.apply(strings));

        System.out.println("\nExercício 5: ");
        Consumer<List<Integer>> removerDuplicados = l -> {
            List<Integer> duplicados = new ArrayList<>();

            for(Integer i : l) {
                if(duplicados.contains(i))
                    l.remove(i);
                else
                    duplicados.add(i);
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(2); nums.add(3);

        System.out.println("Antes: " + nums);
        removerDuplicados.accept(nums);
        System.out.println("Depois: " + nums);

        System.out.println("\nExercício 6: ");
        UnaryOperator<Integer> fatorial = i -> {
            int result = i;
            for (int j = i - 1; j >= 1 ; j--) result *= j;
            return result;
        };
        System.out.println("Fatorial de 5 = " + fatorial.apply(5));

        System.out.println("\nExercício 7: ");
        Predicate<Integer> isPrimo = i -> {
            if(i == 1) return false;

            int divisores = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) divisores++;
                if(divisores > 2) return false;
            }

            return true;
        };

        System.out.println("O número 2 é primo: " + isPrimo.test(2));
        System.out.println("O número 12 é primo: " + isPrimo.test(12));

        System.out.println("\nExercício 8: ");
        BinaryOperator<String> concatenar = (s1, s2) -> s1 + s2;
        System.out.println("String 1: Java");
        System.out.println("String 2: Script");
        System.out.println("String concatenada: " + concatenar.apply("Java", "Script"));
    }

}
