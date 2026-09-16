package listaGenerics.exercicio07;

import java.util.ArrayList;
import java.util.List;

public class TestaLista {

    static void main() {
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Produto> l3 = new ArrayList<>();
        l1.add("MAcaco");
        l1.add("Abóbora");
        l2.add(1);
        l2.add(3);
        l3.add(new Produto("ABC", 12.0));
        l3.add(new Produto("DEF", 12.5));

        imprimirLista(l1);
        imprimirLista(l2);
        imprimirLista(l3);
    }

    //Não é possível usar List<Object> lista como argumento devido à invariância dos tipos genéricos: mesmo que String
    //herde de Object, List<String> não herda de List<Object>. São tipos totalmente distintos.
    static void imprimirLista(List<?> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println();

        /*Devido à segurança de tipos, lista não pode receber novos valores. Isto evita que uma String seja adicionada a
        //uma lista de Integer, por exemplo. Porém, o código lista.add(null); compila, ou seja, pode ser executado, pois
        //o valor null é válido como instância de qualquer classe. Já em uma lista não modificável, ambas as instruções
        //add não compilariam.
        Object elemento = lista.get(0);
        lista.add("novo");
        lista.add(null);
        lista.clear();*/
    }

}
