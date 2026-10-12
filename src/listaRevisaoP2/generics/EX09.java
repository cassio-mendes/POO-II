package listaRevisaoP2.generics;

import java.util.List;

public class EX09 {

    static void main() {
        List<Integer> intList = List.of(1, 2, 3, 4);
        List<String> stringList = List.of("AAA", "BBB", "CCC");

        printList(intList);
        printList(stringList);
    }

    static void printList(List<?> list) { System.out.println(list); }

}
