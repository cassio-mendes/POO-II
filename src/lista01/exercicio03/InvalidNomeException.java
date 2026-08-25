package lista01.exercicio03;

public class InvalidNomeException extends Exception {
    public InvalidNomeException() {
        super("O nome está vazio");
    }
}
