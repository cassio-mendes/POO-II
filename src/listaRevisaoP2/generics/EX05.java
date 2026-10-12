package listaRevisaoP2.generics;

import java.util.ArrayList;
import java.util.List;

public class EX05 {

    static void main() {
        List<Integer> l1 = List.of(1, 2, 3, 4);
        List<Integer> l2 = List.of(10, 11, 12, 13);
        System.out.println(alternatedList(l1, l2));
    }

    static <T> List<T> alternatedList(List<T> l1, List<T> l2) {
        List<T> result = new ArrayList<>();

        int size = l1.size() + l2.size(), j = 0, k = 0;

        for (int i = 0; i < size; i++) {
            if(i % 2 == 0 && j < l1.size()) {
                result.add(l1.get(j)); j++;
            } else {
                result.add(l2.get(k)); k++;
            }
        }
        
        return result;
    }

}
