package listaRevisaoP2.generics;

import java.util.List;

public class EX11 {

    static void main() {
        System.out.println(somarList(List.of(1,2,3,4)));
        System.out.println(somarList(List.of(2.0, 3.7)));
    }

    static double somarList(List<? extends Number> list) {
        //list.add(3); O compilador impede porque não sabe a qual subclasse de Number
        //pertencem os elementos de list.

        Number soma = 0.0;
        for(Number n : list) soma = soma.doubleValue() + n.doubleValue();

        return soma.doubleValue();
    }

}
