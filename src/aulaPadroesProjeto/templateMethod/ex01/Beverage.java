package aulaPadroesProjeto.templateMethod.ex01;

public abstract class Beverage {

    public void prepare() {
        System.out.println("- Fervendo água;");
        prepareBeverage();
        System.out.println("- Colocando bebida na xícara;");
        addIngredients();
        finishBeverage();
    }

    protected abstract void prepareBeverage();

    protected abstract void addIngredients();

    protected abstract void finishBeverage();
}
