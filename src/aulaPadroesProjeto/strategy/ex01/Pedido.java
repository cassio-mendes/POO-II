package aulaPadroesProjeto.strategy.ex01;

public class Pedido {

    private double kg;

    public Pedido(double kg) { this.kg = kg; }

    public double calcularFrete(int tipoEntrega) {
        return EntregaManager.calcularFrete(kg, tipoEntrega);
    }

    @Override
    public String toString() {
        return this.kg + "";
    }
}
