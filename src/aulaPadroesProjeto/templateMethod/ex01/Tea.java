package aulaPadroesProjeto.templateMethod.ex01;

public class Tea extends Beverage {

    @Override
    protected void prepareBeverage() {
        System.out.println("- Preparando o chá;");
    }

    @Override
    protected void addIngredients() {
        System.out.println("- Adicionando limão;");
    }

    @Override
    protected void finishBeverage() {
        System.out.println("- O chá está pronto!\n");
    }
}
