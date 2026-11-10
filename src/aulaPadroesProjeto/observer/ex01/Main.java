package aulaPadroesProjeto.observer.ex01;

import javax.swing.*;

public class Main {

    static void main() {
        Subject sujeito = new Subject();
        LogObserver logs = new LogObserver();
        sujeito.addObserver(logs);

        SwingUtilities.invokeLater(() -> {
            BarraProgresso tela = new BarraProgresso("Simulador de Barra de Progresso", sujeito);
        });
    }

}
