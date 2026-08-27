package lista03.exercicio06;

public class TestaEmpresa {

    static void main() {
        Empresa emp = new EmpresaConcreta("NOME", "CNPJ");

        Empresa.Funcionario func = emp.new Funcionario("Pedro");
        func.acessandoEmpresa();

        Empresa.Informacoes info = new Empresa.Informacoes();
        info.acessandoEmpresa(emp);
    }

}
