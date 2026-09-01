package aulaGenerics.exercicio01;

public class TestaPair {

    static void main(String[] args) {
        Pair<String, Integer> dados = new Pair<>();
        dados.setFirst("Cássio");
        dados.setSecond(19);

        System.out.println("Nome: " + dados.getFirst());
        System.out.println("Idade: " + dados.getSecond());

        dados = new Pair<String, Integer>("Arthur", 20); //Outro construtor
        System.out.println("Nome: " + dados.getFirst());
        System.out.println("Idade: " + dados.getSecond());
    }

}
