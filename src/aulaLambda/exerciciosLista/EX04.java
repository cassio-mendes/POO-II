package aulaLambda.exerciciosLista;

import java.util.Arrays;
import java.util.List;

public class EX04 {
    static void main(String[] args) {
        List<String> fruits = Arrays.asList("maçã", "banana", "abacaxi", "pera");

        //Está sendo usado um Consumer<String>, que imprime um valor sem retornar nada
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
