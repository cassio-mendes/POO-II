package listaRevisaoP2.generics;

import java.util.ArrayList;
import java.util.List;

public class EX02 {

    static void main() {
        List<Number> numeros = somas(List.of(1, 2, 3, 4));
        System.out.println("Soma dos pares: " + numeros.get(0));
        System.out.println("Soma dos ímpares: " + numeros.get(1));

        numeros = somas(List.of(1.0, 2.5, 3.0, 4.5));
        System.out.println("Soma dos pares: " + numeros.get(0));
        System.out.println("Soma dos ímpares: " + numeros.get(1));
    }

    static <T extends Number> List<Number> somas(List<T> numeros) {
        Number par = 0, impar = 0;

        for(T i : numeros) {
            if(i.intValue() % 2 == 0) par = par.intValue() + i.intValue();
            else impar = impar.intValue() + i.intValue();
        }

        List<Number> lista = new ArrayList<>();
        lista.add(par);
        lista.add(impar);
        return lista;
    }

}
