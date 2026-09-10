package aulaGenerics2.exercicio02;

public class PrintArray {

    static void main() {
        String[] strings = {"Carlos", "Joana", "Tadeu"};
        Integer[] numbers = {5, 10, 9, 15};

        try {
            printArray(strings, 0,  2);
            printArray(numbers, 1, 3);

        } catch (IllegalArgumentException | InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }
    }

    static <T> void printArray(T[] array, int lowSubscript, int rightSubscript)
            throws IllegalArgumentException, InvalidSubscriptException  {

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

}
