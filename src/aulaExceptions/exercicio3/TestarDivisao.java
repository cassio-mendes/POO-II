package aulaExceptions.exercicio3;

public class TestarDivisao {

    static void main() {
        realizarDivisao(10, 0);
        realizarDivisao(12, 2);
    }

    static void realizarDivisao(int n1, int n2) {
        try {
            if(n2 == 0) throw new ArithmeticException("Erro: Divisão por zero!");

            System.out.println("Resultado da divisão: " + (n1/n2));
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
