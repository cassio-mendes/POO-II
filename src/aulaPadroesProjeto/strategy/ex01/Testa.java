package aulaPadroesProjeto.strategy.ex01;

public class Testa {

    static void main() {
        Pedido p = new Pedido(15.0);
        double freteEconomica = p.calcularFrete(EntregaManager.ECONOMICA);
        double freteExpressa = p.calcularFrete(EntregaManager.EXPRESSA);
        double freteRetirada = p.calcularFrete(EntregaManager.RETIRADA);

        System.out.println("Frete da entrega econômica: " + freteEconomica);
        System.out.println("Frete da entrega expressa: " + freteExpressa);
        System.out.println("Frete da retirada na loja: " + freteRetirada);
    }

}
