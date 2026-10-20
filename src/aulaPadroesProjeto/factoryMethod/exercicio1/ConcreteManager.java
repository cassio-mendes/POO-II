package aulaPadroesProjeto.factoryMethod.exercicio1;

public class ConcreteManager extends ReportManager{

    public final static int PDF = 0;
    public final static int HTML = 1;

    @Override
    public Report createReport(int t) {
        if(t == PDF) return new PDFReport();
        else if(t == HTML) return new HTMLReport();
        else return new ExcelReport();
    }
}
