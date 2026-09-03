package lista03.exercicio04;

public class Biblioteca {

    private class Livro {
        private String titulo, autor;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + '}';
        }
    }

    private String nome, endereco;
    private Livro[] livros;

    public Biblioteca(String nome, String endereco, int nLivros) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new Livro[nLivros];
    }

    public void addLivro(String titulo, String autor) {
        for(int i = 0; i < this.livros.length; i++) {
            if(this.livros[i] == null) {
                this.livros[i] = new Livro(titulo, autor); break;
            }
        }
    }

    public void getInformacoes() {
        System.out.println("---Biblioteca " + this.nome + "---");
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Livros: ");

        for(Livro l : this.livros) {
            System.out.println(l);
        }
    }

}
