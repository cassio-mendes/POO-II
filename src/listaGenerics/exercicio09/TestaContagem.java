package listaGenerics.exercicio09;

import java.util.ArrayList;
import java.util.List;

public class TestaContagem {

    static void main() {
        ArrayList<Integer> inteiros = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Object> objetos = new ArrayList<>();

        try {
            adicionarContagem(inteiros, 5);
            adicionarContagem(numbers, 6);
            adicionarContagem(objetos, 7);
            adicionarContagem(objetos, 0);

            System.out.println(inteiros);
            System.out.println(numbers);
            System.out.println(objetos);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void adicionarContagem(List<? super Integer> destino, int quantidade)
            throws IllegalArgumentException {

        if(quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");

        if(destino == null) throw new IllegalArgumentException("Lista nula");

        if(quantidade != 0) {
            for (int i = 1; i <= quantidade; i++) destino.add(i);
        }
    }

}
