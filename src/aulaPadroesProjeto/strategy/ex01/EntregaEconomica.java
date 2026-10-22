package aulaPadroesProjeto.strategy.ex01;

public class EntregaEconomica implements Entrega {

    @Override
    public double calcularValor(double kg) {
        return kg * 5.0;
    }

}
