package lista03.exercicio08;

public class Calculadora {

    public static double calcular(String operacao, double operando1, double operando2)
            throws IllegalArgumentException {

        class Operacao {

            protected static double n1, n2;

            public Operacao(double operando1, double operando2) {
                n1 = operando1; n2 = operando2;
            }

            double executar() { return 0; }
        }

        class Soma extends Operacao {

            public Soma(double operando1, double operando2) {
                super(operando1, operando2);
            }

            @Override
            double executar() { return n1 + n2; }
        }

        class Subtracao extends Operacao {

            public Subtracao(double operando1, double operando2) {
                super(operando1, operando2);
            }

            @Override
            double executar() { return n1 - n2; }
        }

        class Multiplicacao extends Operacao {

            public Multiplicacao(double operando1, double operando2) {
                super(operando1, operando2);
            }

            @Override
            double executar() { return n1 * n2; }
        }

        class Divisao extends Operacao {

            public Divisao(double operando1, double operando2) {
                super(operando1, operando2);
            }

            @Override
            double executar() { return n1 / n2; }
        }

        Operacao op;

        if(operacao.equalsIgnoreCase("soma")) {
            op = new Soma(operando1, operando2);

        } else if(operacao.equalsIgnoreCase("subtracao")) {
            op = new Subtracao(operando1, operando2);

        } else if(operacao.equalsIgnoreCase("multiplicacao")) {
            op = new Multiplicacao(operando1, operando2);

        } else if(operacao.equalsIgnoreCase("divisao")) {
            op = new Divisao(operando1, operando2);
        } else {
            throw new IllegalArgumentException("Operação inválida");
        }

        return op.executar();
    }
}
