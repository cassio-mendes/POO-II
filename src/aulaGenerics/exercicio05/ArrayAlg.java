package aulaGenerics.exercicio05;

public class ArrayAlg<T extends Comparable> {

    public static Pair<String> minMax(String[] a){
        if ((a == null) || (a.length == 0))
            return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<String>(min, max);
    }

    public Pair<T> getMin(Pair<T>[] pares) {
        if(pares == null || pares.length == 0) return null;

        Pair<T> min = pares[0];
        for (int i = 1; i < pares.length; i++) {
            if(min.compareTo(pares[i]) > 0) min = pares[i];
        }

        return min;
    }

    public Pair<T> getMax(Pair<T>[] pares) {
        if(pares == null || pares.length == 0) return null;

        Pair<T> max = pares[0];
        for (int i = 1; i < pares.length; i++) {
            if(max.compareTo(pares[i]) < 0) max = pares[i];
        }

        return max;
    }

}
