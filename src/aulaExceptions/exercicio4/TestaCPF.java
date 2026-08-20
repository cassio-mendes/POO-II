package aulaExceptions.exercicio4;

public class TestaCPF {

    static void main() {
        validarCPF("147.904.355-40"); //CPF válido
        validarCPF("111.111.111-11"); //CPF inválido
    }

    static void validarCPF(String cpf) {
        try {
            int[] digitos = new int[11];
            int j = 0;

            //Obtém os números como int
            for (int i = 0; i < cpf.length(); i++) {
                char c = cpf.charAt(i);
                if(c != '.' && c != '-') {
                    digitos[j] = Integer.parseInt(String.valueOf(c));
                    j++;
                }
            }

            //Verifica se os dígitos são válidos
            int multiplicador = 10, soma = 0;

            for (int i = 0; i < 9; i++) { //9 primeiros dígitos
                soma += digitos[i] * multiplicador;
                multiplicador--;
            }

        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
