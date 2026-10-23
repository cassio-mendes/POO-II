package aulaPadroesProjeto.templateMethod.ex01;

public class Cafeteria {

    static void main() {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("======= CAFÉ =======");
        coffee.prepare();

        System.out.println("======= CHÁ =======");
        tea.prepare();
    }

}
