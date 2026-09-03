package lista03.exercicio09;

public class Calculadora {

    public static double calcularPreco(double preco) {
        double desconto = 0.2;

        class AplicaDesconto {
            double precoFinal;
            public AplicaDesconto() { precoFinal = preco - (preco * desconto); }
        }

        AplicaDesconto ad = new AplicaDesconto();
        return ad.precoFinal;
    }

}
