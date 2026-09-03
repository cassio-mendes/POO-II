package lista03.exercicio02;

public class Pessoa {

    private String nome;
    private Documento doc;

    public Pessoa(String nome) {
        this.nome = nome;
        this.doc = new Documento();
    }

    private class Documento {
        public void exibirNome() {
            System.out.println(nome);
        }
    }

    public void exibirNome() { this.doc.exibirNome(); }

}
