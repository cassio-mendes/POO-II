package aulaPadroesProjeto.templateMethod.ex02;

import javax.swing.*;
import java.awt.*;

public class ApplicationLogon {

    static void main() {
        JFrame teste = new JFrame("TESTE");
        teste.setSize(300, 300);
        teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teste.setLocationRelativeTo(null);

        JButton botao = new JButton("LOGON");
        botao.setBounds(150, 200, 100, 25);
        botao.setFont(new Font("Arial", Font.PLAIN, 18));
        botao.addActionListener(e -> {
            Logon l = new Logon();
            l.logon(teste, "Programa de Testes");
        });

        teste.add(botao);
        teste.setVisible(true);
    }

}
