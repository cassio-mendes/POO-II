package listaRevisaoP2.generics;

import java.util.List;

public class EX03 {

    static void main() {
        List<String> stringList = List.of("Cavalo", "Pato", "Caqui");
        System.out.println(find(stringList, "Cavalo"));
        System.out.println(find(stringList, "Abóbora"));

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(find(intList, 2));
        System.out.println(find(intList, 10));
    }

    static <T> int find(List<T> list, T element) {
        return list.indexOf(element);
    }

}
