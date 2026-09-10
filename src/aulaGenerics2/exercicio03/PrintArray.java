package aulaGenerics2.exercicio03;

public class PrintArray {

    static void main() {
        String[] strings = {"Carlos", "Joana", "Tadeu", "Álvaro", "Alberto"};
        Integer[] numbers = {5, 10, 9, 15};
        Double[] numbers2 = {12.0, 5.6, 90.7, 1.0};

        try {
            printArray(numbers2, 0,  4);
            printArray(numbers, 1, 3);
            printArray(strings, 1, 4);
            printArray(strings, 0, 2);

        } catch (IllegalArgumentException | InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }
    }

    static <T> void printArray(T[] array, int lowSubscript, int rightSubscript)
            throws IllegalArgumentException, InvalidSubscriptException {

        if(array == null || array.length == 0) throw new IllegalArgumentException("Array inválido");

        if(lowSubscript < 0 || rightSubscript > array.length || (rightSubscript - lowSubscript) < 1)
            throw new InvalidSubscriptException();

        System.out.print("[");
        for (int i = lowSubscript; i < rightSubscript; i++) {
            System.out.print(array[i]);
            if(i < rightSubscript - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    //Este metodo pode ser utilizado para imprimir arrays de um tipo específico (string)
    //Isto pode ser útil para implementar regras específicas à impessão de cada tipo de dado
    static void printArray(String[] array, int lowSubscript, int rightSubscript)
            throws IllegalArgumentException, InvalidSubscriptException {

        if(array == null || array.length == 0) throw new IllegalArgumentException("Array inválido");

        if(lowSubscript < 0 || rightSubscript > array.length || (rightSubscript - lowSubscript) < 1)
            throw new InvalidSubscriptException();

        System.out.print("[");
        for (int i = lowSubscript; i < rightSubscript; i++) {
            System.out.print(array[i]);
            if(i < rightSubscript - 1) System.out.print("\t");
        }
        System.out.println("]");
    }

}
