package lista03.exercicio11;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) { this.nome = nome;}

    public void printDados() {
        String cpf = "111.111.111-11";

        if(!this.nome.isEmpty()) {
            class Documento {
                public Documento() {
                    System.out.println("Nome: " + nome);
                    System.out.println("CPF: " + cpf);
                }
            }

            Documento d = new Documento();
        } else {
            //A classe Documeno pode ser acessada apenas dentro do escopo no qual está inserida, neste caso um if
            //new Documento();
        }
    }
}
