package listaRevisaoP2.generics;

import java.util.ArrayList;
import java.util.List;

public class EX10 {

    static void main() {
        List<Integer> inteiros = new ArrayList<>();
        List<Number> numeros = new ArrayList<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        copyList(inteiros, numeros);
        System.out.println(numeros);
    }

    static <T> void copyList(List<? extends T> producer, List<? super T> consumer) {
        consumer.addAll(producer);
    }

}
