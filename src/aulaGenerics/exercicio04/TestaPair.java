package aulaGenerics.exercicio04;

public class TestaPair {

    static void main() {
        Pair<String> s1 = new Pair<>("A", "B");
        Pair<String> s2 = new Pair<>("A", "C");
        Pair<Integer> n1 = new Pair<>(1, 2);
        Pair<Comparable> c1 = new Pair<>("A", "D");

        System.out.println("Tipos iguais: " + s1.compareTo(s2));
        System.out.println("Tipos compatíveis: " + s1.compareTo(c1));
        System.out.println("Tipos distintos: " + s1.compareTo(n1)); //CastErrorException
    }

}
