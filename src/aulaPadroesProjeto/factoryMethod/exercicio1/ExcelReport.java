package aulaPadroesProjeto.factoryMethod.exercicio1;

public class ExcelReport extends Report {

    public ExcelReport() {
        this.generate();
    }

    @Override
    public void generate() {
        this.texto = "Excel";
    }
}
