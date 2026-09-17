package listaGenerics.exercicio10;

import java.util.List;

public class TestaCopiar {

    static void main() {

    }

    static void copiar(List<? extends Comparable> origem, List<Object> destino) {
        destino.addAll(origem);
    }

}
