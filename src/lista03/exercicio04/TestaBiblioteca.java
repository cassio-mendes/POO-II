package lista03.exercicio04;

public class TestaBiblioteca {

    static void main(String[] args) {
        Biblioteca b = new Biblioteca("Livraria", "Rua XXXXXXXX", 3);
        b.addLivro("O Ladrão de Raios", "Rick Riordan");
        b.addLivro("Dom Casmurro", "Machado de Assis");
        b.addLivro("Drácula", "Bram Stoker");
        b.getInformacoes();
    }

}
