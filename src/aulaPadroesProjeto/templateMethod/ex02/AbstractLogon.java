package aulaPadroesProjeto.templateMethod.ex02;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractLogon {

    public void logon(Frame frame, String programName) {
        Object authenticationToken = null;
        LogonDialog logonDialog = new LogonDialog(frame, "Log on to " + programName);
        JDialog waitDialog = createWaitDialog(frame);

        while (true) {
            logonDialog.setVisible(true);

            // CORREÇÃO: Se o usuário fechou a janela ou clicou em Cancelar, sai do loop sem travar
            if (!logonDialog.isConfirmed()) {
                break;
            }

            try {
                String userID = logonDialog.getUserID();
                String password = logonDialog.getPassword();

                // Exemplo de uso do waitDialog se desejar
                waitDialog.setVisible(true);

                authenticationToken = authenticate(userID, password);

                waitDialog.dispose();
                break; // Sucesso! Sai do loop.

            } catch (Exception e) {
                waitDialog.setVisible(false);

                // Exibe o erro, mas permite que o usuário decida se quer tentar de novo ou cancelar
                int opcao = JOptionPane.showConfirmDialog(
                        frame,
                        e.getMessage() + "\nDeseja tentar novamente?",
                        "Authentication Failure",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE
                );

                if (opcao == JOptionPane.NO_OPTION) {
                    logonDialog.setConfirmed(false);
                    break; // Sai do loop se o usuário desistir
                }

                // Se escolher SIM, reseta a confirmação para o loop rodar de novo voluntariamente
                logonDialog.resetDialog();
            }
        }

        // Fecha e limpa os diálogos
        logonDialog.dispose();
        waitDialog.dispose();

        // Só notifica se realmente autenticou com sucesso
        if (authenticationToken != null) {
            notifyAuthentication(authenticationToken);
        }
    }

    // Metodo auxiliar exigido pelos slides
    private JDialog createWaitDialog(Frame frame) {
        JDialog wait = new JDialog(frame, "Aguarde");
        wait.setSize(200, 100);
        wait.setLocationRelativeTo(frame);
        wait.add(new JLabel("Processando autenticação...", SwingConstants.CENTER));
        return wait;
    }

    protected abstract Object authenticate(String userID, String password) throws Exception;

    protected abstract void notifyAuthentication(Object authToken);
}