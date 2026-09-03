package lista03.exercicio16;

public class TestaCofre {

    static void main(String[] args) {
        Cofre c = new Cofre("1234", 200.0);
        Cofre.Operador op = c.new Operador();

        System.out.println("Antes: " + c.getValor());
        op.alteraValor(300.0);
        System.out.println("Depois: " + c.getValor());
    }

}
