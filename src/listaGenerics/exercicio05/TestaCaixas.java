package listaGenerics.exercicio05;

public class TestaCaixas {

    static void main() {
        CaixaNumerica<Integer> caixaInteira = new CaixaNumerica<>(5);

        Caixa<Integer> primeira = caixaInteira; //Compila!

        //Esta linha não compila devido à invariância dos argumentos de tipo: Caixa<Number> pode receber qualquer valor
        //Number ou que herde de Number, enquanto CaixaNumerica<Integer> recebe apenas valores Integer ou que herdem de
        //Integer. Mesmo Integer herdando de Number, a instrução Caixa<Number> segunda = caixaInteira; permitiria que
        //valores que herdam de Number mas não de Integer, como Double, fossem inseridos numa caixa de Integer, o que
        //quebraria o código.
        //Caixa<Number> segunda = caixaInteira;

        //Esta linha compila porque se utiliza de um "coringa": terceira é uma Caixa que pode receber valores de um tipo
        //desconhecido, desde que ele extenda de Number. Assim, terceira pode acessar os valores de caixaInteira e
        //retorná-los como um Number, mas não pode atribuir novos valores, para garantir que caixaInteira receba apenas
        //inteiros.
        Caixa<? extends Number> terceira = caixaInteira; //Compila!

    }

}
