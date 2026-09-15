package listaGenerics.exercicio02;

public class TestaPar {

    static void main() {
        System.out.println("---PAR NORMAL---");
        Par<String, Integer> pessoa = new Par<>("José", 32);
        System.out.println("Nome: " + pessoa.getKEY());
        System.out.println("Idade: " + pessoa.getVALUE());
        System.out.println("----------------\n");

        System.out.println("---PAR INVERTIDO---");
        Par<Integer, String> inverso = pessoa.invertido();
        System.out.println("Idade: " + inverso.getKEY());
        System.out.println("Nome: " + inverso.getVALUE());
        System.out.println("-------------------");
    }

}
