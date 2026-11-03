package aulaPadroesProjeto.observer.ex01;

public class Main {

    static void main() {
        Subject sujeito = new Subject();
        LogObserver logs = new LogObserver();
        sujeito.addObserver(logs);

        BarraProgresso tela = new BarraProgresso("Simulador de Barra de Progresso", sujeito);
    }

}
