package aulaPadroesProjeto.templateMethod.ex02;

import javax.swing.*;

public class Logon extends AbstractLogon {

    @Override
    protected Object authenticate(String userID, String password) throws Exception {
        // Simulação baseada no slide 13
        if (userID.equals("abc") && password.equals("123")) {
            return "Token-Autenticado-998877";
        }
        throw new Exception("Usuário ou senha inválidos.");
    }

    @Override
    protected void notifyAuthentication(Object authToken) {
        JOptionPane.showMessageDialog(null,
                "Autenticação realizada com sucesso!\nToken: " + authToken,
                "Bem-vindo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}