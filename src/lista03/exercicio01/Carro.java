package lista03.exercicio01;

public class Carro {

    private static class Tanque {
        int nivel;
        public Tanque(int nivel) { this.nivel = nivel; }
        public void getNivel() {
            System.out.println("Nível do tanque: " + this.nivel);
        }
    }

    private Tanque tanque;

    public Carro() {
        this.tanque = new Tanque(500);
    }

    public void getNivel() { this.tanque.getNivel(); }

}
