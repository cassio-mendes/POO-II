package aulaPadroesProjeto.strategy.ex01;

public class EntregaManager {

    public static final int ECONOMICA = 0;
    public static final int EXPRESSA = 1;
    public static final int RETIRADA = 2;

    public static double calcularFrete(double kg, int tipoEntrega) {
        if(tipoEntrega == ECONOMICA) return new EntregaEconomica().calcularValor(kg);

        if(tipoEntrega == EXPRESSA) return new EntregaExpressa().calcularValor(kg);

        if(tipoEntrega == RETIRADA) return new RetiradaLoja().calcularValor(kg);

        return -1;
    }

}
