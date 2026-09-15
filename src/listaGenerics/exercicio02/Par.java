package listaGenerics.exercicio02;

public class Par<K, V> {
    private final K KEY;
    private final V VALUE;

    public Par(K key, V value) {
        this.KEY = key;
        this.VALUE = value;
    }

    public K getKEY() { return KEY; }

    public V getVALUE() { return VALUE; }

    public Par<V, K> invertido() {
        return new Par<V, K>(this.VALUE, this.KEY);
    }
}
