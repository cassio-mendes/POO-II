package lista02;

public class Ex01 {

    private static class Carro {
        private String marca, modelo;
        private Motor motor;

        public Carro(String marca, String modelo, String tipoMotor, double potenciaMotor) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = new Motor(tipoMotor, potenciaMotor);
        }

        private class Motor {
            double potencia; String tipo;

            public Motor(String tipo, double potencia) {
                this.tipo = tipo;
                this.potencia = potencia;
            }
        }

        public void exibirDados() {
            System.out.println("Marca: " + this.marca);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Potência: " + this.motor.potencia);
            System.out.println("Tipo: " + this.motor.tipo);
        }
    }

    static void main() {
        Carro c = new Carro("Toyota", "Corolla", "Flex", 177.0);
        c.exibirDados();
    }

}
