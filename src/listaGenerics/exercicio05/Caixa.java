package listaGenerics.exercicio05;

public class Caixa<T> {

    private T valor;

    public Caixa() {}

    public Caixa(T valor) { this.valor = valor; }

    public void guardar(T v) { this.valor = v; }

    protected T obter() { return this.valor; }

}
