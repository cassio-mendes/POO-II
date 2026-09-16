package listaGenerics.exercicio06;

public class Produto implements Identificavel, Comparable<Produto> {

    private String id;
    private double preco;

    public Produto(String id, double preco) {
        this.id = id;
        this.preco = preco;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int compareTo(Produto o) {
        if(this.preco > o.preco) return 1;
        else if(this.preco < o.preco) return -1;
        else return 0;
    }

    public double getPreco() { return this.preco; }
}
