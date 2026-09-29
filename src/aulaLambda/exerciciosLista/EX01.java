package aulaLambda.exerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EX01 {

    static void main() {
        Predicate<String> prefixoPRE = s -> !(s.startsWith("Pre") || s.startsWith("pre"));

        List<String> lista = new ArrayList<>();
        lista.add("Prefixo");
        lista.add("Predicado");
        lista.add("Compre");
        lista.add("preferido");

        System.out.println("Antes: " + lista);
        lista.removeIf(prefixoPRE);
        System.out.println("Depois: " + lista);

    }

}
