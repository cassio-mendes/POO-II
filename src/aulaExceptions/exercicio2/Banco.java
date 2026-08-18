package aulaExceptions.exercicio2;

public class Banco {

    private Conta[] contas;

    public Banco(Conta... contas) {
        this.contas = contas;
    }

    public void transferencia(int contaDe, int contaPara, double valor)
            throws CNEException, SIException {

        verificaConta(contaDe);
        verificaConta(contaPara);

        //Ambas as contas existem
        Conta debitar = new Conta(), creditar = new Conta(); //Evitando NullPointerException

        for(Conta c : this.contas) {
            if(c.getnConta() == contaDe) {
                debitar = c; break;
            }
        }

        for(Conta c : this.contas) {
            if(c.getnConta() == contaPara) {
                creditar = c; break;
            }
        }

        //Debita da contaDe e credita na contaPara
        debitar.debita(valor);
        creditar.credita(valor);
    }

    //imprimir o valor dos
    //depósitos nas contas bancárias. Além disso, o total em limites excedidos por
    //contas de saldo negativo (cheque especial).
    public void balanco() {
        System.out.println("Depósitos:");

    }

    private void verificaConta(int conta) throws CNEException {
        boolean existe = false;

        for(Conta c : this.contas) {
            if(c.getnConta() == conta) {
                existe = true; break;
            }
        }

        if(!existe) throw new CNEException(conta + "");
    }
}
