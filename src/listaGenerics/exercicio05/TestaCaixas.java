package listaGenerics.exercicio05;

public class TestaCaixas {

    static void main() {
        CaixaNumerica<Integer> caixaInteira = new CaixaNumerica<>(5);

        Caixa<Integer> primeira = caixaInteira;
        //Caixa<Number> segunda = caixaInteira;
        Caixa<? extends Number> terceira = caixaInteira;

        Caixa<Double> c = new Caixa<>(2.0);
        //Caixa<Number> a = c;
    }

}
