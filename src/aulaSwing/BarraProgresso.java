package aulaSwing;

import javax.swing.*;
import java.awt.*;

public class BarraProgresso extends JFrame {

    private JLabel mensagemProgresso;
    private JLabel percentualProgresso;
    private JProgressBar barraProgresso;
    private int valorProgresso = 0;

    public BarraProgresso(String titulo) {
        super(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);

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

        JButton avancarBtn = new JButton("AVANÇAR");
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
        avancarBtn.addActionListener(e -> {
            valorProgresso += 10;
            barraProgresso.setValue(valorProgresso);

            if(valorProgresso >= 100) {
                mensagemProgresso.setText("Barra de Progresso: Download Conluído!");
                avancarBtn.setEnabled(false);
            } else {
                mensagemProgresso.setText("Barra de Progresso: Download em andamento...");
            }

            percentualProgresso.setText(valorProgresso + "%");
        });

        resetarBtn.addActionListener(e -> {
            valorProgresso = 0;
            barraProgresso.setValue(valorProgresso);
            percentualProgresso.setText("0%");
            mensagemProgresso.setText("Barra de Progresso: ");
            avancarBtn.setEnabled(true);
        });
    }

    static void main() {
        new BarraProgresso("Simulador de Barra de Progresso");
    }

}
