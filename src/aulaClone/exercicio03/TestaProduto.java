package aulaClone.exercicio03;

public class TestaProduto {

    static void main() {
        Produto p1 = new Produto("Hollow Knight", "01", 39.90);
        Produto p2 = p1.clonar();
        p2.setNome("Hollow Kinght Silksong");
        p2.setPreco(40.0);

        System.out.println(p1);
        System.out.println(p2);
    }

}
