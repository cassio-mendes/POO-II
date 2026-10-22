package aulaPadroesProjeto.factoryMethod.ex01;

public class Testa {

    static void main() {
        ReportManager manager = new ConcreteManager();

        Report r1 = manager.generateReport(ConcreteManager.PDF);
        Report r2 = manager.generateReport(ConcreteManager.HTML);
        Report r3 = manager.generateReport(ConcreteManager.EXCEL);

        System.out.println("\n=== Exemplo de criação de objetos com Factory Method ===");
        System.out.println("\nObjetos no manager:");
        manager.printReports();

        System.out.println("\nObjetos retornados");
        System.out.println(r1 + ", " + r2 + ", " + r3);

        System.out.println("\nSão os mesmos!");
    }

}
