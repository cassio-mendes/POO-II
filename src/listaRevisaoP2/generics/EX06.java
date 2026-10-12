package listaRevisaoP2.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EX06 {

    static void main() {
        Predicate<Object> isNumber = o -> o instanceof Number;

        System.out.println(isTrue(List.of(1, 2, 3, 4), isNumber));
        System.out.println(isTrue(List.of('A', 'B', 'C'), isNumber));
    }

    static <T> List<T> isTrue(List<T> list, Predicate<Object> predicado) {
        List<T> result = new ArrayList<>();

        for(T l : list) {
            if(predicado.test(l)) result.add(l);
        }
        return result;
    }

}
