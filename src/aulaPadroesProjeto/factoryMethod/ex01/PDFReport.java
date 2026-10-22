package aulaPadroesProjeto.factoryMethod.ex01;

public class PDFReport extends Report {

    public PDFReport() {
        this.generate();
    }

    @Override
    public void generate() {
        this.texto = "PDF";
    }
}
