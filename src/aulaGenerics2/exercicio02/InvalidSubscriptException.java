package aulaGenerics2.exercicio02;

public class InvalidSubscriptException extends RuntimeException {
    public InvalidSubscriptException() {
        super("Intervalo inválido");
    }
}
