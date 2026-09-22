package lista4.exercicio02;

public class Produto implements Comparable<Produto> {

    private String nome, ID;
    private double preco;

    public Produto(String nome, String ID, double preco) {
        this.nome = nome;
        this.ID = ID;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
        if(this.preco < o.preco) return -1;
        else if(this.preco > o.preco) return 1;
        else return 0;
    }

    public String getNome() {
        return nome;
    }

    public String getID() {
        return ID;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return this.nome + " | R$" + this.preco;
    }
}
