package aulaSwing;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Testes {

    private static int numero = 5; //Variação de cores RGB

    static void main() {

        //Componente alto nível
        JFrame d = new JFrame();
        d.setTitle("Testando Cores");
        d.setSize(500, 500);
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Componente intermediário
        JTabbedPane tabs = new JTabbedPane();

        //Componentes baixo nível
        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        createKeyListener(p1);

        tabs.add("Vermelho", p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.GREEN);
        createKeyListener(p2);

        tabs.add("Verde", p2);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.BLUE);
        createKeyListener(p3);

        tabs.add("Azul", p3);

        tabs.addChangeListener(e -> {
            if(tabs.getSelectedComponent().equals(p1)) p1.requestFocusInWindow();
            else if(tabs.getSelectedComponent().equals(p2)) p2.requestFocusInWindow();
            else p3.requestFocusInWindow();
        });

        d.add(tabs);
        d.setVisible(true);
        p1.requestFocusInWindow();
    }

    private static void createKeyListener(JPanel p) {
        p.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int red = p.getBackground().getRed();
                int green = p.getBackground().getGreen();
                int blue = p.getBackground().getBlue();

                if(e.getKeyCode() == KeyEvent.VK_R) {
                    if(numero > 0) red = red + numero > 255 ? 0 : red + numero;
                    else red = red + numero < 0 ? 255 : red + numero;

                } else if(e.getKeyCode() == KeyEvent.VK_G){
                    if(numero > 0) green = green + numero > 255 ? 0 : green + numero;
                    else green = green + numero < 0 ? 255 : green + numero;

                } else if(e.getKeyCode() == KeyEvent.VK_B) {
                    if(numero > 0) blue = blue + numero > 255 ? 0 : blue + numero;
                    else blue = blue + numero < 0 ? 255 : blue + numero;
                }

                p.setBackground(new Color(red, green, blue));
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        //Configuração dos JRadioButtons
        JPanel painel = new JPanel();
        painel.setBounds(0, 369, 100, 70);
        painel.setBackground(Color.WHITE);
        painel.setBorder(new LineBorder(Color.BLACK, 2));

        JRadioButton aumentar = new JRadioButton("Aumentar", true);
        JRadioButton diminuir = new JRadioButton("Diminuir", false);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(aumentar);
        grupo.add(diminuir);

        aumentar.addActionListener(e2 -> {
            numero = 5;
            p.requestFocusInWindow();
        });
        diminuir.addActionListener(e3 -> {
            numero = -5;
            p.requestFocusInWindow();
        });

        painel.add(aumentar);
        painel.add(diminuir);

        p.setLayout(null);
        p.add(painel);
    }

}
