package aulaPadroesProjeto.delegacao.ex01;

public class Gerente {

    private final double VALOR_COMISSAO = 550.0;
    private final double VALOR_CONSULTORIA = 350.0;
    private Salario salario;

    public double getPagamento(TiposPagamento t) {
        switch (t) {
            case COMISSAO -> {
                this.salario = new PagarComissao(this.VALOR_COMISSAO);
                return this.salario.pagamento();
            }

            case CONSULTORIA -> {
                this.salario = new PagarConsultoria(this.VALOR_CONSULTORIA);
                return this.salario.pagamento();
            }

            default -> { return -1.0; }
        }
    }

}
