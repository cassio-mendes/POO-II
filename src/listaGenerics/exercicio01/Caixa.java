package listaGenerics.exercicio01;

public class Caixa<T> {

    private T valor;

    public Caixa () {}

    public Caixa(T valor) { this.valor = valor; }

    public void guardar(T v) { this.valor = v; }

    public T obter() { return this.valor; }

}
