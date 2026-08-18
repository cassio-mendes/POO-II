package aulaExceptions.exercicio2;

public class CNEException extends RuntimeException {
    public CNEException(String conta) { super("Conta bancária " + conta + " não existe"); }
}
