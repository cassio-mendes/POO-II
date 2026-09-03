package lista03.exercicio18;

public class Veiculo {

    protected class Motor {
        private double potencia;

        public Motor(double potencia) { this.potencia = potencia; }

        public double getPotencia() { return potencia; }
    }

    protected String nome;
    protected Motor motor;

    public Veiculo(String nome, double potencia) {
        this.nome = nome;
        this.motor = new Motor(potencia);
    }

}
