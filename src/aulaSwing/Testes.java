package aulaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Testes {

    static void main() {

        //Componente alto nível
        JDialog d = new JDialog();
        d.setTitle("Exemplo de Diálogo");
        d.setSize(500, 500);
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        //Componente intermediário
        JTabbedPane tabs = new JTabbedPane();

        //Componentes baixo nível
        JPanel p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        createKeyListener(p1);

        tabs.add("Verde", p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        createKeyListener(p2);

        tabs.add("Azul", p2);

        tabs.addChangeListener(e -> {
            if(tabs.getSelectedComponent().equals(p1)) p1.requestFocusInWindow();
            else p2.requestFocusInWindow();
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

                if(e.getKeyCode() == KeyEvent.VK_R) red = red + 5 > 255 ? 0 : red + 5;
                else if(e.getKeyCode() == KeyEvent.VK_G) green = green + 5 > 255 ? 0 : green + 5;
                else if(e.getKeyCode() == KeyEvent.VK_B) blue = blue + 5 > 255 ? 0 : blue + 5;

                p.setBackground(new Color(red, green, blue));
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

}
