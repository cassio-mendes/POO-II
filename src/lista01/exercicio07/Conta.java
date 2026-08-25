package lista01.exercicio07;

public class Conta {

    private int nConta;
    private double saldo;
    private boolean clienteEspecial;
    private double limite = 0.0;
    private double chequeEspecial = 0.0;

    public Conta() {}

    public Conta(int nConta, double saldo, boolean clienteEspecial) {
        this.nConta = nConta;
        this.saldo = saldo;
        this.clienteEspecial = clienteEspecial;
        if(this.clienteEspecial) this.limite = 1000.0;
    }

    public void debita(double v) throws SIException {
        if(this.saldo < v) { //Saldo insuficiente

            if(!this.clienteEspecial || (v - this.saldo) > this.limite) //Não pode debitar
                throw new SIException(this.nConta + "");

            else { //Clientes especiais podem ter saldo negativo dentro do limite
                this.saldo -= v;
                this.limite -= v;

                //Corrige o limite para 0, para mostrar que não pode mais contrair dívidas
                if(this.limite < 0.0) this.limite = 0.0;

                this.chequeEspecial += (this.saldo * -1);
            }
        } else {
            this.saldo -= v;
        }
    }

    public void credita(double v) { this.saldo += v; }

    public int getnConta() { return this.nConta; }

    public double getChequeEspecial() { return this.chequeEspecial; }

    public double getLimite() { return this.limite; }

    public boolean isClienteEspecial() { return this.clienteEspecial; }
}
