package listaRevisaoP2.generics;

public class EX08 {

    static void main() {
        Integer[] array1 = {1, 2, 3, 4};
        String[] array2 = {"AAA", "BBB", "CCC", "DDD", "EEE"};

        System.out.println(buscaBinaria(array1, 1));
        System.out.println(buscaBinaria(array2, "BBB"));
        System.out.println(buscaBinaria(array1, 19));
        System.out.println(buscaBinaria(array2, "FFF"));

    }

    static <T extends Comparable<T>> int buscaBinaria(T[] array, T element) {
        return buscaBinaria(array, element, 0, array.length - 1);
    }

    static <T extends Comparable<T>> int buscaBinaria(T[] array, T element,
                                                      int left, int right) {
        if(right < left) return -1;

        int index = (left + right) / 2;

        if(array[index].compareTo(element) == 0) return index;
        else if(array[index].compareTo(element) < 0) left = index + 1;
        else right = index - 1;

        return buscaBinaria(array, element, left, right);
    }

}
