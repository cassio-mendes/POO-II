package aulaPadroesProjeto.factoryMethod.exercicio1;

public class ConcreteManager extends ReportManager{

    public final static int PDF = 0;
    public final static int HTML = 1;
    public final static int EXCEL = 2;

    @Override
    public Report createReport(int t) {
        if(t == PDF) return new PDFReport();
        if(t == HTML) return new HTMLReport();
        if(t == EXCEL) return new ExcelReport();
        return null;
    }
}
