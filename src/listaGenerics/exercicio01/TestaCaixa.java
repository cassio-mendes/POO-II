package listaGenerics.exercicio01;

public class TestaCaixa {

    static void main() {
        Caixa<String> strings = new Caixa<>();
        Caixa<Integer> ints = new Caixa<>(5);

        String valor = "10";
        strings.guardar(valor);
        System.out.println(strings.obter());

        int n = 2;
        ints.guardar(n);
        System.out.println(ints.obter());

        //strings.guardar(n); //Erro: Caixa<Strings> não pode receber um Integer, pois Integer não herda de String
        //O argumento de tipo <T> deve ser Integer ao invés de int, pois classes genéricas trabalham apenas com
        //classes, não com tipos brutos
    }

}
