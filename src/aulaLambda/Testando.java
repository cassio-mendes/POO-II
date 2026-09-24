package aulaLambda;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Date;

public class Testando {

    static void main() {
        ActionListener listener = event ->
                System.out.println("Hora: " + new Date());

        new Timer(1000, listener).start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
