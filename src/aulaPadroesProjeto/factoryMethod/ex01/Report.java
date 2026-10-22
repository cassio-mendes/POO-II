package aulaPadroesProjeto.factoryMethod.ex01;

public abstract class Report {

    protected String texto;

    public abstract void generate();

    @Override
    public String toString() {
        return this.texto;
    }
}
