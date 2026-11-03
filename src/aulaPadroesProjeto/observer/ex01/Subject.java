package aulaPadroesProjeto.observer.ex01;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;
    private int valorAtual;

    public Subject() {
        this.observers = new ArrayList<>();
        this.valorAtual = 0;
    }

    public void avancarProgresso() {
        this.valorAtual += 10;
        if(this.valorAtual > 100) this.valorAtual = 100;
        notifyObservers();
    }

    public void resetarProgresso() {
        this.valorAtual = 0;
        notifyObservers();
    }

    public void addObserver(Observer ob) {
        this.observers.add(ob);
    }

    private void notifyObservers() {
        for(Observer ob : this.observers) {
            ob.update(this.valorAtual);
        }
    }

}
