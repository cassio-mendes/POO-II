package lista01.exercicio06;

public class PesosInvalidosException extends RuntimeException {
    public PesosInvalidosException() {
        super("A soma dos pesos deve ser 1.0");
    }
}
