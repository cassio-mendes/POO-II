package aulaEnumerate;

public class PesosInvalidosException extends RuntimeException {
    public PesosInvalidosException() {
        super("A soma dos pesos deve ser 1.0");
    }
}
