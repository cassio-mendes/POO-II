package aulaGenerics.exercicio02;

import java.util.ArrayList;

public class TestaListaGenerica {

    static void main(String[] args) {
        ArrayList<Employee> lista = new ArrayList<>();
        lista.add(new Manager("AAA", "BBB"));
        System.out.println(lista);
    }

}
