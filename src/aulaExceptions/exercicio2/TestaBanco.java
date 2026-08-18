package aulaExceptions.exercicio2;

public class TestaBanco {

    static void main() {
        Conta c1 = new Conta(1, 1000.0, true);
        Conta c2 = new Conta(2, 500.0, false);
        Conta c3 = new Conta(3, 30000.0, true);
        Banco banco = new Banco(c1, c2, c3);

        banco.transferencia(5, 2, 100000.0); //CNEException
        banco.transferencia(6, 1, 100000.0); //CNEException
        banco.transferencia(1, 2, 500.0);
        banco.transferencia(1, 3, 700.0);
        banco.transferencia(5, 2, 100000.0);
        banco.transferencia(5, 2, 100000.0);
        banco.transferencia(5, 2, 100000.0);
        banco.transferencia(5, 2, 100000.0);
        banco.transferencia(5, 2, 100000.0);
        banco.transferencia(5, 2, 100000.0);
    }

}
