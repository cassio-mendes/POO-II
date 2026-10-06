package aulaPadroesProjeto.delegacao.ex01;

public class PagarConsultoria implements Salario {

    private double valor;

    public PagarConsultoria(double valor) { this.valor = valor; }

    @Override
    public double pagamento() {
        return Salario.BASE + this.valor;
    }
}
