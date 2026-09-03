package lista03.exercicio18;

public class Carro extends Veiculo {

    private String modelo, marca;

    public Carro(String nome, double potencia, String modelo, String marca) {
        super(nome, potencia);
        this.modelo = modelo;
        this.marca = marca;
    }

    public void getInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Potência: " + this.motor.getPotencia()); //Acessa a inner class de Veiculo
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
    }
}
