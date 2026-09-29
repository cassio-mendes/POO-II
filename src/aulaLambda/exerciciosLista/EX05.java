package aulaLambda.exerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EX05 {

    static void main() {
        System.out.println("a)");

        List<String> palavras = List.of("Escola", "Estudos", "Paraleleípedo");
        System.out.println("Antes: " + palavras);

        Predicate<String> seteOuMaisLetras = s -> s.length() >= 7;
        List<String> filtrada = filterWords(palavras, seteOuMaisLetras);

        System.out.println("Depois: " + filtrada);

        System.out.println("\nb)");
        Consumer<String> print = s -> System.out.println(s);
        processWords(palavras, print);

        System.out.println("\nc)");

        Predicate<Integer> isPar = n -> n % 2 == 0;
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        System.out.println("Antes: " + numeros);
        List<Integer> pares = filterNumbers(numeros, isPar);
        System.out.println("Depois: " + pares);
    }

    // Helper method that uses Predicate
    static List<String> filterWords(List<String> words, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (predicate.test(word)) {
                result.add(word);
            }
        }
        return result;
    }

    // Helper method that uses Consumer
    static void processWords(List<String> words, Consumer<String> processor) {
        for (String word : words) {
            processor.accept(word);
        }
    }

    // Helper method for numbers
    static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }

}
