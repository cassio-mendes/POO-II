package listaGenerics.exercicio08;

import java.util.ArrayList;
import java.util.List;

public class TestaSoma {

    static void main() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(6);
        System.out.println("Integer: " + somar(lista));

        ArrayList<Double> lista2 = new ArrayList<>();
        lista2.add(12.5);
        lista2.add(13.5);
        System.out.println("Double: " + somar(lista2));

        ArrayList<Number> lista3 = new ArrayList<>();
        lista3.add(5);
        lista3.add(2.0);
        System.out.println("Number: " + somar(lista3));
    }

    //Não será possível inserir um novo valor em numeros, porque o compilador não sabe para qual objeto
    //esta referência aponta na memória: caso seja um objeto Integer e o Java permitissse a atribuição de
    //novos valores, seria possível atribuir um Double a um espaço destinado a Integer, o que quebraria o
    //código.
    static double somar(List<? extends Number> numeros) {
        if(numeros == null || numeros.isEmpty()) return 0;

        double soma = 0.0;
        for(Number n : numeros) {
            soma += n.doubleValue();
        }

        return soma;
    }

}
