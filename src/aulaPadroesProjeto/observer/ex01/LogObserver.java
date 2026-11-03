package aulaPadroesProjeto.observer.ex01;

public class LogObserver implements Observer, Runnable {

    private int value;

    @Override
    public void update(int value) {
        this.value = value;
        this.run();
    }

    @Override
    public void run() {
        System.out.println("PROGRESSO: " + this.value + "%");
    }
}
