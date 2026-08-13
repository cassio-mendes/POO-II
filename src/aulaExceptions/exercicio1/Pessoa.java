package aulaExceptions.exercicio1;

public abstract class Pessoa {

    protected String nome;
    protected int idade, ID;

    public Pessoa(String nome, int idade, int ID)
            throws InvalidNomeException, InvalidIdadeException, InvalidIDException {

        this.setNome(nome);
        this.setIdade(idade);
        this.setID(ID);
    }

    public void setNome(String nome) throws InvalidNomeException {
        if(nome.isEmpty())
            throw new InvalidNomeException();
        else
            this.nome = nome;
    }

    public void setIdade(int idade) throws InvalidIdadeException {
        if(idade < 0)
            throw new InvalidIdadeException();
        else
            this.idade = idade;
    }

    protected abstract void setID(int ID) throws InvalidIDException;

    @Override
    public String toString() {
        return "Pessoa{ nome='" + nome + '\'' + ", idade=" + idade + ", ID=" + ID + " }";
    }
}
