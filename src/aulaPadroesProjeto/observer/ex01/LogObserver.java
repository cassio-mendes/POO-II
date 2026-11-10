package aulaPadroesProjeto.observer.ex01;

public class LogObserver implements Observer {

    @Override
    public void update(int value) {
        new Thread(() -> System.out.println("PROGRESSO: " + value + "%")).start();
    }

}
