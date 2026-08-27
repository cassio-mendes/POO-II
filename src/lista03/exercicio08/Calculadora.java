package lista03.exercicio08;

public class Calculadora {

    public static double calcular(String operacao, double operando1, double operando2)
            throws IllegalArgumentException {

        class Operacao {

            private static double n1, n2;

            public Operacao(double operando1, double operando2) {
                n1 = operando1; n2 = operando2;
            }

            double executar() { return 0; }

            static class Soma extends Operacao {

                public Soma(double operando1, double operando2) {
                    super(operando1, operando2);
                }

                @Override
                double executar() { return n1 + n2; }
            }

            static class Subtracao extends Operacao {

                public Subtracao(double operando1, double operando2) {
                    super(operando1, operando2);
                }

                @Override
                double executar() { return n1 - n2; }
            }

            static class Multiplicacao extends Operacao {

                public Multiplicacao(double operando1, double operando2) {
                    super(operando1, operando2);
                }

                @Override
                double executar() { return n1 * n2; }
            }

            static class Divisao extends Operacao {

                public Divisao(double operando1, double operando2) {
                    super(operando1, operando2);
                }

                @Override
                double executar() { return n1 / n2; }
            }
        }

        Operacao op;

        if(operacao.equalsIgnoreCase("soma")) {
            op = new Operacao.Soma(operando1, operando2);

        } else if(operacao.equalsIgnoreCase("subtracao")) {
            op = new Operacao.Subtracao(operando1, operando2);

        } else if(operacao.equalsIgnoreCase("multiplicacao")) {
            op = new Operacao.Multiplicacao(operando1, operando2);

        } else if(operacao.equalsIgnoreCase("divisao")) {
            op = new Operacao.Divisao(operando1, operando2);
        } else {
            throw new IllegalArgumentException("Operação inválida");
        }

        return op.executar();
    }
}
