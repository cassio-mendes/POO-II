package aulaGenerics2.exercicio03;

public class InvalidSubscriptException extends RuntimeException {
    public InvalidSubscriptException() {
        super("Intervalo inválido");
    }
}
