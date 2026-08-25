package lista01.exercicio07;

public class TestaBanco {

    static void main() {
        Conta c1 = new Conta(1, 1000.0, true);
        Conta c2 = new Conta(2, 500.0, false);
        Conta c3 = new Conta(3, 30000.0, true);
        Banco banco = new Banco(c1, c2, c3);

        testaCNEException(banco);
        testaSIException(banco);
        System.out.println(); //Quebra de linha

        //Transferências regulares
        try {
            banco.transferencia(1, 2, 2000.0);
            banco.transferencia(2, 3, 100.0);
            banco.transferencia(3, 1, 10000.0);
            banco.transferencia(2, 1, 400.0);
            banco.transferencia(3, 1, 10000.0);
            banco.transferencia(3, 2, 11000.0);
        } catch(CNEException | SIException ex) {
            System.out.println(ex.getMessage());
        }

        banco.balanco(); //Testando balanço
    }

    static void testaCNEException(Banco banco) {
        try {
            banco.transferencia(5, 2, 100000.0); //CNEException
        } catch(CNEException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testaSIException(Banco banco) {
        try {
            banco.transferencia(2, 1, 2000.0); //SIException
        } catch(SIException e) {
            System.out.println(e.getMessage());
        }
    }

}
