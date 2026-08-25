package lista01.exercicio03;

import javax.swing.*;

public class TestaPessoa {

    static void main() {

        try {
            PessoaFisica pessoaFisica = new PessoaFisica("A", 15, 99);
            System.out.println(pessoaFisica);

            PessoaJuridica pessoaJuridica = new PessoaJuridica("B", 50, 130);
            System.out.println(pessoaJuridica);

            System.out.println("Tudo Certo!");

        } catch (InvalidNomeException | InvalidIdadeException | InvalidIDException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
