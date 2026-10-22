package aulaSwing;

import javax.swing.*;
import java.awt.*;

public class Operacoes extends JFrame {

    private JTextField primeiroInput;
    private JTextField segundoInput;
    private JTextField resultadoInput;

    public Operacoes() {
        //Configs. da tela
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font padrao = new Font("Arial", Font.PLAIN, 18); //Fonte de texto padrão

        //Painel de fundo
        JPanel background = new JPanel();
        background.setLayout(null);

        //Título do painel
        JLabel titulo = new JLabel("Somatório");
        titulo.setBounds(200, 80, 150, 30);
        titulo.setFont(new Font("Arial", Font.PLAIN, 25));
        background.add(titulo);

        //Textos e campos de entrada
        JLabel primeiroLabel = new JLabel("Primeiro: ");
        primeiroLabel.setBounds(80, 140, 100, 30);
        primeiroLabel.setFont(padrao);
        background.add(primeiroLabel);

        JLabel segundoLabel = new JLabel("Segundo: ");
        segundoLabel.setBounds(80, 180, 100, 30);
        segundoLabel.setFont(padrao);
        background.add(segundoLabel);

        JLabel resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(80, 220, 100, 30);
        resultadoLabel.setFont(padrao);
        background.add(resultadoLabel);

        primeiroInput = new JTextField();
        primeiroInput.setBounds(180, 140, 240, 30);
        primeiroInput.setFont(padrao);
        background.add(primeiroInput);

        segundoInput = new JTextField();
        segundoInput.setBounds(180, 180, 240, 30);
        segundoInput.setFont(padrao);
        background.add(segundoInput);

        resultadoInput = new JTextField();
        resultadoInput.setBounds(180, 220, 240, 30);
        resultadoInput.setFont(padrao);
        resultadoInput.setEditable(false);
        background.add(resultadoInput);

        //Botões de somar e limpar os campos de entrada
        JButton somarBtn = new JButton("SOMAR");
        somarBtn.setFont(padrao);
        somarBtn.setBounds(140, 280, 100, 30);
        background.add(somarBtn);

        JButton limparBtn = new JButton("LIMPAR");
        limparBtn.setFont(padrao);
        limparBtn.setBounds(280, 280, 100, 30);
        background.add(limparBtn);

        //Adiciona eventos aos botões
        addEventoSomar(somarBtn);
        addEventoLimpar(limparBtn);

        this.add(background);  //Adiciona o painel com o conteúdo
        this.setVisible(true); //Mostra a tela pronta
    }

    private void addEventoSomar(JButton somarBtn) {
        somarBtn.addActionListener(e -> {
            String txt1 = primeiroInput.getText();
            String txt2 = segundoInput.getText();

            try {
                float n1 = Float.parseFloat(txt1);
                float n2 = Float.parseFloat(txt2);
                resultadoInput.setText(n1 + n2 + "");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ERRO: Informe apenas números",
                        "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void addEventoLimpar(JButton limparBtn) {
        limparBtn.addActionListener(e -> {
            primeiroInput.setText("");
            segundoInput.setText("");
            resultadoInput.setText("");
        });
    }

    static void main() {
        new Operacoes();
    }

}
