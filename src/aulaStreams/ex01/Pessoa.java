package aulaStreams.ex01;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String cpf, nome, sobrenome, data, endereco, email, telefone;

    public Pessoa(String cpf, String nome, String sobrenome, String data, String endereco, String email,
                  String telefone) {

        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data = data;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return this.cpf + " | " + this.nome + " " + this.sobrenome + " | " + this.email + " | " + this.data +
                " | " + this.endereco + " | " + this.telefone + ";";
    }
}
