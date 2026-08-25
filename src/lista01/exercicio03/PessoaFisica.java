package lista01.exercicio03;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(String nome, int idade, int ID)
        throws InvalidNomeException, InvalidIdadeException, InvalidIDException {

        super(nome, idade, ID);
    }

    @Override
    protected void setID(int ID) throws InvalidIDException {
        if(ID < 0 || ID > 100)
            throw new InvalidIDException("O ID deve estar entre 0 e 100");
        else
            this.ID = ID;
    }
}
