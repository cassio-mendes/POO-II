package aulaPadroesProjeto.delegacao.ex01;

public class Vendedor {

    private Salario salario;

    public double getPagamento(TiposPagamento t) {
        switch (t) {
            case COMISSAO -> {
                this.salario = new PagarComissao(t.getValor());
                return this.salario.pagamento();
            }

            case CONSULTORIA -> {
                this.salario = new PagarConsultoria(t.getValor());
                return this.salario.pagamento();
            }

            default -> { return -1.0; }
        }
    }

}
