package aulaClone.exercicio03;

public class Produto implements Cloneable {
    private String nome;
    private String ID;
    private double preco;

    public Produto(String nome, String ID, double preco) {
        this.nome = nome;
        this.ID = ID;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Produto clonar() {
        return new Produto(nome, this.ID, preco);
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", ID='" + ID + '\'' + ", preco=" + preco + '}';
    }
}
