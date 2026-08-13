package aulaExceptions.exercicio1;

public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome, int idade, int ID)
            throws InvalidNomeException, InvalidIdadeException, InvalidIDException {
        super(nome, idade, ID);
    }

    @Override
    protected void setID(int ID) throws InvalidIDException {
        if(ID < 101 || ID > 200)
            throw new InvalidIDException("O ID deve estar entre 101 e 200");
        else
            this.ID = ID;
    }
}
