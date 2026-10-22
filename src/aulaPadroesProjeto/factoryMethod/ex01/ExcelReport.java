package aulaPadroesProjeto.factoryMethod.ex01;

public class ExcelReport extends Report {

    public ExcelReport() {
        this.generate();
    }

    @Override
    public void generate() {
        this.texto = "Excel";
    }
}
