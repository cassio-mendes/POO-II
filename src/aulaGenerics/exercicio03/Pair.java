package aulaGenerics.exercicio03;

public class Pair<T extends Comparable> implements Comparable<Pair> {

    private T first, second;

    public Pair() { this.first = null; this.second = null; }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }

    public void setFirst(T first) { this.first = first; }

    public T getSecond() { return second; }

    public void setSecond(T second) { this.second = second; }

    @Override
    public int compareTo(Pair o) {
        if(this.first.compareTo(o.first) == 0) return 0;
        else if(this.first.compareTo(o.first) < 0) return -1;
        else return 1;
    }
}
