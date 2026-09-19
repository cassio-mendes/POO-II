package listaGenerics.exercicio10;

import java.util.ArrayList;
import java.util.List;

public class TestaCopiar {

    static void main() {
        ArrayList<Number> numeros = new ArrayList<>();
        numeros.add(4);

        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);

        ArrayList<Object> objetos = new ArrayList<>();
        objetos.add("AAAA");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("ASAS");
        strings.add("NLKJN");

        copiar(inteiros, numeros);
        copiar(strings, objetos);

        System.out.println(numeros);
        System.out.println(objetos);

        /*Exemplo de erro de compilação:
        * copiar(numeros, inteiros);    numeros pode conter números que não são inteiros, portanto não é possível copiar
        * seus valores para uma lista de inteiros*/
    }

    //O uso de PECS com tipo genérico T garante que o destino sempre aceitará todos os objetos da origem, devido à herança.
    //Ao ler um elemento de uma List<? super Integer>, por exemplo, é garantido que o retorno será, pelo menos, um Integer
    static <T> void copiar(List<? extends T> origem, List<? super T> destino) {
        destino.addAll(origem);
    }

}
