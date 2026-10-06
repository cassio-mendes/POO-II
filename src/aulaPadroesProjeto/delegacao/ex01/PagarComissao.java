package aulaPadroesProjeto.delegacao.ex01;

public class PagarComissao implements Salario {

    private double valor;

    public PagarComissao(double valor) { this.valor = valor; }

    @Override
    public double pagamento() {
        return Salario.BASE + this.valor;
    }
}
