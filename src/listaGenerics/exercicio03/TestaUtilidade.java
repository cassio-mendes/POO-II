package listaGenerics.exercicio03;

public class TestaUtilidade {

    static void main() {
        try {
            Integer inteiro = Utilidade.primeiro(new Integer[]{1, 2, 3});
            System.out.println(inteiro);

            String string = Utilidade.primeiro(new String[]{"ABC", "DEF"});
            System.out.println(string);

            String vazio = Utilidade.primeiro(new String[]{});
            System.out.println(vazio);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
