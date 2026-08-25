package lista01.exercicio07;

public class CNEException extends RuntimeException {
    public CNEException(String conta) { super("Conta bancária " + conta + " não existe"); }
}
