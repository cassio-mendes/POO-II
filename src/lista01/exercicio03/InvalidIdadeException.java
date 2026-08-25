package lista01.exercicio03;

public class InvalidIdadeException extends Exception {
    public InvalidIdadeException() {
        super("A idade não pode ser negativa");
    }
}
