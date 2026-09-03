package lista03.exercicio10;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) { this.nome = nome;}

    public void printDados() {
        String cpf = "111.111.111-11";

        class Documento {
            public Documento() {
                System.out.println("Nome: " + nome);
                //O atributo do metodo externo precisa ser final para ser acessado na classe local
                //System.out.println("CPF: " + cpf);
            }
        }

        Documento d = new Documento();
        cpf = "A"; //Esta alteração indica que a variável cpf não é final
    }
}
