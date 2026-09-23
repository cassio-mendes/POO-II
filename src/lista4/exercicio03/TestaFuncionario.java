package lista4.exercicio03;

import java.util.Date;

public class TestaFuncionario {

    static void main() {
        Funcionario f1 = new Funcionario("José", 3000.0);
        Funcionario f2 = (Funcionario) f1.clone();

        System.out.println("Data de f1: " + f1.getDataAdmissao());
        System.out.println("Data de f2: " + f2.getDataAdmissao());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        f2.setDataAdmissao(new Date());

        System.out.println("Data de f1: " + f1.getDataAdmissao());
        System.out.println("Data de f2: " + f2.getDataAdmissao());
    }

}
