package lista03.exercicio07;

public class Externa {

    //É preciso que valor seja static para que possa ser referenciado dentro da classe Interna, porque ela também é static
    private static int valor = 10;

    static class Interna {
        void mostrar() {
            System.out.println(valor);
        }
    }
}

