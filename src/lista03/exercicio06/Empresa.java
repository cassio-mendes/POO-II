package lista03.exercicio06;

public abstract class Empresa {

    private String nomeEmpresa;
    private static String cnpj;

    public Empresa(String nomeEmpresa, String CNPJ) {
        this.nomeEmpresa = nomeEmpresa;
        cnpj = CNPJ;
    }

    public void acessandoInstancia() {
        System.out.println("Acessando atributo de instância: " + this.nomeEmpresa);
    }

    public static void acessandoStatic() {
        System.out.println("Acessando atributo static: " + cnpj);
    }

    public abstract void realizandoAuditoria();

    public class Funcionario {
        String nome;

        public Funcionario(String nome) { this.nome = nome; }

        public void acessandoEmpresa() {
            System.out.println("\nAcessos de Funcionario (inner class)");

            System.out.println(this.nome + " acessando instância:");
            acessandoInstancia();

            System.out.println(this.nome + " acessando atibuto static:");
            acessandoStatic();

            System.out.println(this.nome + " executando método abstrato:");
            realizandoAuditoria();
        }
    }

    public static class Informacoes {
        public void acessandoEmpresa(Empresa instancia) {
            System.out.println("\nAcessos de Informacoes (inner class static)");

            System.out.println("Atributo estático: " + cnpj);
            acessandoStatic();

            if(instancia != null) { //Precisa de uma instância para acessar atibutos não-estáticos de Empresa
                System.out.println("Atributo de Instância: " + instancia.nomeEmpresa);
                instancia.acessandoInstancia();
                instancia.realizandoAuditoria();
            }
        }
    }

}
