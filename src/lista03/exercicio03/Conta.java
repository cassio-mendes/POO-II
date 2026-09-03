package lista03.exercicio03;

public class Conta {

    private int numero;
    private Operacao op;

    public Conta(int n1, int n2) {
        this.numero = n1;
        this.op = new Operacao(n2);
        this.op.exibir();
    }

    private class Operacao {
        private int numero;

        public Operacao(int n) { this.numero = n; }

        public void exibir() {
            System.out.println(this.numero + " e " + Conta.this.numero);
        }
    }

}
