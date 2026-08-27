package lista03.exercicio08;

public class TestaCalculadora {

    static void main() {
        try {
            String[] operacoes = {"soma", "subtracao", "multiplicacao", "divisao", "AAA"};

            for(String op : operacoes) {
                System.out.println(Calculadora.calcular(op, 5.0, 10.0));
            }
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
