package aulaExceptions.exercicio2;

public class Conta {

    private int nConta;
    private double saldo;
    private boolean clienteEspecial;
    private double limite = 0.0;

    public Conta() {}

    public Conta(int nConta, double saldo, boolean clienteEspecial) {
        this.nConta = nConta;
        this.saldo = saldo;
        this.clienteEspecial = clienteEspecial;
        if(this.clienteEspecial) this.limite = 1000.0;
    }

    public void debita(double v) throws SIException {
        if(this.saldo < v) { //Saldo insuficiente

            if(!this.clienteEspecial || v > this.limite) //Não pode debitar
                throw new SIException(this.nConta + "");

            else { //Clientes especiais podem ter saldo negativo dentro do limite
                this.saldo -= v;
                this.limite -= v;
            }
        } else {
            this.saldo -= v;
        }
    }

    public void credita(double v) { this.saldo += v; }

    public int getnConta() { return this.nConta; }

    public double getSaldo() { return this.saldo; }

    public boolean isClienteEspecial() { return this.clienteEspecial; }
}
