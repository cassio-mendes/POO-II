package aulaExceptions.exercicio1;

public class InvalidNomeException extends Exception {
    public InvalidNomeException() {
        super("O nome está vazio");
    }
}
