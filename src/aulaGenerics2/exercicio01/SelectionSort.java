package aulaGenerics2.exercicio01;

import java.util.Arrays;

public class SelectionSort {

    static void main() {
        String[] strings = {"Família", "Cachaça", "Abril"};
        Integer[] numbers = {15, 2, 17, 9};

        try {
            selectionSort(strings);
            selectionSort(numbers);

            System.out.println("Strings: " + Arrays.toString(strings));
            System.out.println("Numbers: " + Arrays.toString(numbers));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static <T extends Comparable<T>> void selectionSort(T[] elements) throws IllegalArgumentException {
        if(elements == null || elements.length == 0)
            throw new IllegalArgumentException("Array inválido");

        int aux; T x;
        for (int i = 0; i < elements.length - 1; i++) {
            aux = i;

            for (int j = i + 1; j < elements.length; j++) {
                if(elements[j].compareTo(elements[aux]) < 0) aux = j;
            }

            x = elements[i];
            elements[i] = elements[aux];
            elements[aux] = x;
        }
    }

}
