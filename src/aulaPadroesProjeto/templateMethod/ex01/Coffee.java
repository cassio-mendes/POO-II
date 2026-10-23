package aulaPadroesProjeto.templateMethod.ex01;

public class Coffee extends Beverage {

    @Override
    protected void prepareBeverage() {
        System.out.println("- Passando o café;");
    }

    @Override
    protected void addIngredients() {
        System.out.println("- Adicionando açúcar;");
    }

    @Override
    protected void finishBeverage() {
        System.out.println("- O café está pronto!\n");
    }
}
