package aulaPadroesProjeto.delegacao.ex01;

public enum TiposPagamento {
    COMISSAO(500.0), CONSULTORIA(200.0);

    private final double valor;

    TiposPagamento(double v) {
        this.valor = v;
    }

    public double getValor() { return this.valor; }
}
