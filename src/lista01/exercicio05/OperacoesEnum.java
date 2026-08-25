package lista01.exercicio05;

public class OperacoesEnum {
    
    public enum Operacao { //Enumeração de operações aritméticas básicas
        SOMA {
            @Override
            public double executar(double n1, double n2) { return n1 + n2; }
        }, 
        
        SUBTRACAO {
            @Override
            public double executar(double n1, double n2) { return n1 - n2; }
        },
        
        MULTIPLICACAO {
            @Override
            public double executar(double n1, double n2) { return n1 * n2; }
        },
        
        DIVISAO {
            @Override
            public double executar(double n1, double n2) throws ArithmeticException {
                if(n2 != 0)
                    return n1/n2;
                else 
                    throw new ArithmeticException("Erro: Não é possível dividir por zero."); //ERRO aritmético
            }
        };

        public abstract double executar(double n1, double n2); //Metodo abstrato
    }

    static void main(String[] args) {

        //Parâmetros:
        double n1 = 10.5, n2 = 0.0, n3 = 2.0, n4 = 4.5;
        System.out.printf("Números: %.1f %.1f %.1f e %.1f\n", n1, n2, n3, n4);

        //Chamando operações:
        System.out.println("Soma: " + calcular(Operacao.SOMA, n1, n2, n3, n4));

        System.out.println("Subtração:" + calcular(Operacao.SUBTRACAO, n1, n2, n3, n4));

        System.out.println("Multiplicação: " + calcular(Operacao.MULTIPLICACAO, n1, n2, n3, n4));

        System.out.println("Divisão: " + calcular(Operacao.DIVISAO, n1, n2, n3, n4));
    }

    private static double calcular(Operacao op, double... numeros) { 
        try {
            double resultado = op.executar(numeros[0], numeros[1]); //Executa a operação com os dois primeiros números

            //Se houver mais números, executa a operação com eles também
            for (int i = 2; i < numeros.length; i++) {
                resultado = op.executar(resultado, numeros[i]);
            }

            return resultado; //Retorna o resultado final
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.MIN_VALUE;
        }
    }

}
