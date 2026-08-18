package aulaExceptions.exercicio2;

public class SIException extends RuntimeException {
    public SIException(String conta) {
        super("Saldo da conta " + conta + " insuficiente");
    }
}
