package listaRevisaoP2.generics;

import java.util.List;

public class EX04 {

    static void main() {
        List<Integer> intList = List.of(1, 2, 3, 4);
        System.out.println(reverse(intList));

        List<String> stringList = List.of("AAA", "BBB", "CCC");
        System.out.println(reverse(stringList));
    }

    static <T> List<T> reverse(List<T> list) {
        return list.reversed();
    }

}
