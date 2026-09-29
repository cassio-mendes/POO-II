package aulaLambda.exerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex02 {

    static void main() {
        Predicate<String> prefixoPRE = s -> s == null;

        List<String> lista = new ArrayList<>();
        lista.add("Prefixo");
        lista.add(null);
        lista.add("Compre");
        lista.add(null);

        System.out.println("Antes: " + lista);
        lista.removeIf(prefixoPRE);
        System.out.println("Depois: " + lista);
    }

}
