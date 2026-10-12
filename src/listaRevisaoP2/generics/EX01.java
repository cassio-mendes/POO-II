package listaRevisaoP2.generics;

public class EX01 {

    static void main(String[] args) {
        Integer[] n1 = {1, 3, 6 ,2};
        Integer[] n2 = {1, 3, 6, 2};
        Integer[] n3 = {13, 13, 13, 13};
        Integer[] n4 = {1, 6, 2, 3};

        comparaArrays(n1, n2);
        comparaArrays(n1, n3);
        comparaArrays(n1, n4);
    }

    static <T> void comparaArrays(T[] array1, T[] array2) {
        if(array1.length != array2.length)
            System.out.println("Elementos diferentes.");
        else {
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]) {
                    System.out.println("Elementos Elementos diferentes.");
                    return;
                }
            }
            System.out.println("Elementos iguais.");
        }
    }

}
