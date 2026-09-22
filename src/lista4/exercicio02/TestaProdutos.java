package lista4.exercicio02;

import java.util.Arrays;

public class TestaProdutos {

    static void main() {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto("Arroz", "1", 20.0);
        produtos[1] = new Produto("Kinder Ovo", "2", 99999.9);
        produtos[2] = new Produto("Feijão", "3", 18.99);

        System.out.println("\nOrdenação por tamanho do nome:");
        System.out.println("Vetor antes: " + Arrays.toString(produtos));
        Arrays.sort(produtos, new TamanhoNomeComparator());
        System.out.println("Vetor depois: " + Arrays.toString(produtos));
    }

}
