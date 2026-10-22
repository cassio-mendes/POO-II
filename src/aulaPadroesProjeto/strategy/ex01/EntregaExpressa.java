package aulaPadroesProjeto.strategy.ex01;

public class EntregaExpressa implements Entrega {

    @Override
    public double calcularValor(double kg) {
        return kg * 10.0 + 15.0;
    }
}
