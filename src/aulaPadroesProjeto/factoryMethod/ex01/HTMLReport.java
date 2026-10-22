package aulaPadroesProjeto.factoryMethod.ex01;

public class HTMLReport extends Report {

    public HTMLReport() {
        this.generate();
    }

    @Override
    public void generate() {
        this.texto = "HTML";
    }
}
