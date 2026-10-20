package aulaPadroesProjeto.factoryMethod.exercicio1;

public class PDFReport extends Report {

    public PDFReport() {
        this.generate();
    }

    @Override
    public void generate() {
        this.texto = "PDF";
    }
}
