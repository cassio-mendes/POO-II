package aulaPadroesProjeto.factoryMethod.exercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportManager {

    private List<Report> lista = new ArrayList<>();

    public abstract Report createReport(int t);

    public Report generateReport(int t) {
        Report r = createReport(t);
        lista.add(r);
        return r;
    }

    public void printReports() {
        System.out.println(lista);
    }

}
