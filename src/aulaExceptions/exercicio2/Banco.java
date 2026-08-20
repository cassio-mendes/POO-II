package aulaExceptions.exercicio2;

import java.util.HashMap;
import java.util.Set;

public class Banco {

    private Conta[] contas;
    private HashMap<Integer[], Double> registro;

    public Banco(Conta... contas) {
        this.contas = contas;
        this.registro = new HashMap<>();
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

        //Registra a transação
        this.registro.put(new Integer[]{contaDe, contaPara}, valor);
    }

    //imprimir o valor dos
    //depósitos nas contas bancárias. Além disso, o total em limites excedidos por
    //contas de saldo negativo (cheque especial).
    public void balanco() {
        Set<Integer[]> keys = this.registro.keySet();
        System.out.println("Depósitos:");

        for(Integer[] contas : keys) {
            double valor = this.registro.get(contas);
            System.out.printf("De %s para %s no valor de %.2f reais.\n", contas[0], contas[1], valor);
        }

        //Cálculo do total em cheques especiais
        double chequeEspecial = 0.0;
        for (int i = 0; i < this.contas.length; i++) {
            if(this.contas[i].isClienteEspecial() && this.contas[i].getLimite() < 1000.0) { //Se está com dívida

                chequeEspecial += this.contas[i].getChequeEspecial(); //Soma o valor da dívida
            }
        }

        if(chequeEspecial > 0.0) { //Se houver clientes endividados
            System.out.println("Total em cheques especiais: " + chequeEspecial);
        }
        System.out.println("Fim do balanço.");
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
