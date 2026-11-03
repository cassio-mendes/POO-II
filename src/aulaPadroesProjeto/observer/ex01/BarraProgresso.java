package aulaPadroesProjeto.observer.ex01;

import javax.swing.*;
import java.awt.*;

public class BarraProgresso extends JFrame implements Observer {

    private JLabel mensagemProgresso;
    private JLabel percentualProgresso;
    private JProgressBar barraProgresso;
    private JButton avancarBtn;

    private Subject sujeito; //Padrão Observer

    public BarraProgresso(String titulo, Subject sujeito) {
        super(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);

        //Adicionando observers ao Subject
        this.sujeito = sujeito;
        this.sujeito.addObserver(this);

        JPanel background = new JPanel();
        background.setLayout(null);
        this.add(background);

        Font fonte = new Font("Arial", Font.PLAIN, 18);
        mensagemProgresso = new JLabel("Barra de Progresso: ");
        mensagemProgresso.setFont(fonte);
        mensagemProgresso.setBounds(100, 200, 450, 20);
        background.add(mensagemProgresso);

        barraProgresso = new JProgressBar();
        barraProgresso.setBounds(100, 250, 400, 30);
        background.add(barraProgresso);

        avancarBtn = new JButton("AVANÇAR");
        avancarBtn.setFont(fonte);
        avancarBtn.setBounds(100, 300, 120, 35);
        estilizarBotao(avancarBtn);
        background.add(avancarBtn);

        JButton resetarBtn = new JButton("RESETAR");
        resetarBtn.setFont(fonte);
        resetarBtn.setBounds(250, 300, 120, 35);
        estilizarBotao(resetarBtn);
        background.add(resetarBtn);

        addActionListeners(avancarBtn, resetarBtn);

        percentualProgresso = new JLabel("0%");
        percentualProgresso.setFont(fonte);
        percentualProgresso.setBounds(430, 305, 80, 20);
        background.add(percentualProgresso);

        this.setVisible(true);
    }

    private void estilizarBotao(JButton botao) {
        botao.setBackground(Color.WHITE);
        botao.setForeground(Color.BLACK);
        botao.setFocusPainted(false);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void addActionListeners(JButton avancarBtn, JButton resetarBtn) {
        avancarBtn.addActionListener(e -> sujeito.avancarProgresso());

        resetarBtn.addActionListener(e -> sujeito.resetarProgresso());
    }

    @Override
    public void update(int value) {
        barraProgresso.setValue(value);

        if(value >= 100) {
            mensagemProgresso.setText("Barra de Progresso: Download Conluído!");
            avancarBtn.setEnabled(false);
        } else if(value > 0) {
            mensagemProgresso.setText("Barra de Progresso: Download em andamento...");
        } else {
            mensagemProgresso.setText("Barra de Progresso: ");
            avancarBtn.setEnabled(true);
        }

        percentualProgresso.setText(value + "%");
    }

}
