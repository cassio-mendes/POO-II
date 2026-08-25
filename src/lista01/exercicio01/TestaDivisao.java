package lista01.exercicio01;

public class TestaDivisao {

    //1- Não, pois é preferível disparar a exceção recursivamente na pilha de execução, para que um metodo anterior,
    //que possua as informações necessárias, implemente um handler (try - catch)
    //2- Neste caso, a exceção deve ser tratada no metodo main

    static void main() {
        try {
            realizarDivisao(1, 2);
            realizarDivisao(10, 5);
            realizarDivisao(3, 0);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void realizarDivisao(int n1, int n2) throws ArithmeticException {
        if(n2 == 0)
            throw new ArithmeticException("Erro: Não é possível dividir por zero.");
        else
            System.out.println("Resultado: " + n1/n2);
    }

}
