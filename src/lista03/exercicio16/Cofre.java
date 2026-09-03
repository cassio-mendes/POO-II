package lista03.exercicio16;

public class Cofre {

    public class Operador {
        public void alteraValor(double v) {
            Cofre.this.alteraValor(v);
        }
    }

    private String senha;
    private double valor;

    public Cofre(String senha, double valor) {
        this.senha = senha;
        this.valor = valor;
    }

    private void alteraValor(double v) {
        this.valor = v;
    }

    public double getValor() {
        return valor;
    }
}
