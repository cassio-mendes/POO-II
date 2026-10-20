package aulaPadroesProjeto.factoryMethod.exercicio1;

public class HTMLReport extends Report {

    public HTMLReport() {
        this.generate();
    }

    @Override
    public void generate() {
        this.texto = "HTML";
    }
}
