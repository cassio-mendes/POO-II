package aulaClone.exercicio01;

public class TestaProduto {

    static void main() {
        Produto p1 = new Produto("Hollow Knight", "01", 39.90);
        Produto p2 = p1.clone("Hollow Knight Silksong", 40.00);

        System.out.println(p1);
        System.out.println(p2);
    }

}
