package lista03.exercicio06;

public class EmpresaConcreta extends Empresa {
    public EmpresaConcreta(String nomeEmpresa, String CNPJ) {
        super(nomeEmpresa, CNPJ);
    }

    @Override
    public void realizandoAuditoria() {
        System.out.println("\nAuditoria realizada!\n");
    }
}
