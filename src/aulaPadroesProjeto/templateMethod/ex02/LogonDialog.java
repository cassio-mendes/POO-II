package aulaPadroesProjeto.templateMethod.ex02;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LogonDialog extends JDialog {
    private JTextField txtUser;
    private JPasswordField txtPass;
    private boolean confirmed = false;

    public LogonDialog(Frame parent, String title) {
        super(parent, title, true); // Modal
        setSize(300, 180);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(3, 2, 10, 10));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

        add(new JLabel("  Usuário:"));
        txtUser = new JTextField("abc"); // Valor padrão de teste conforme a classe Logon
        add(txtUser);

        add(new JLabel("  Senha:"));
        txtPass = new JPasswordField("123"); // Valor padrão de teste
        add(txtPass);

        JButton btnEntrar = new JButton("Entrar");
        JButton btnCancelar = new JButton("Cancelar");

        btnEntrar.addActionListener(e -> {
            confirmed = true;
            setVisible(false);
        });

        btnCancelar.addActionListener(e -> {
            confirmed = false;
            setVisible(false);
        });

        // Trata o fechamento pelo "X" da janela
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmed = false;
                setVisible(false);
            }
        });

        add(btnEntrar);
        add(btnCancelar);
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void resetDialog() {
        this.confirmed = false;
        txtPass.setText("");
        txtPass.requestFocus();
    }

    public String getUserID() {
        return txtUser.getText();
    }

    public String getPassword() {
        return new String(txtPass.getPassword());
    }
}
