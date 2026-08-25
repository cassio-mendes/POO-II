package lista01.exercicio02;

public class TestaCPF {

    static void main() {
        try {
            validarCPF("147.904.366-40"); //CPF válido
            validarCPF("147.904.366-22"); //CPF inválido
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validarCPF(String cpf) throws IllegalArgumentException {
        int[] digitos = new int[11];
        int j = 0;

        //Obtém os números como int
        for (int i = 0; i < cpf.length(); i++) {
            char c = cpf.charAt(i);
            if (c != '.' && c != '-') {
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
        int primeiroDigito = (soma * 10) % 11;
        if (primeiroDigito == 10) primeiroDigito = 0; //Corrige o resto 10 para 0

        if (primeiroDigito != digitos[9]) //Se o primeiro dígito verificador estiver incorreto
            throw new IllegalArgumentException(cpf + " é um CPF inválido");
        else {
            //Calcula o segundo dígito verificador
            soma = 0;
            multiplicador = 11;

            for (int i = 0; i < 10; i++) { //9 primeiros + 1° identificador
                soma += digitos[i] * multiplicador;
                multiplicador--;
            }
            int segundoDigito = (soma * 10) % 11;
            if (segundoDigito == 10) segundoDigito = 0; //Corrige o resto 10 para 0

            if (segundoDigito == digitos[10])
                System.out.println(cpf + " é um CPF válido");
            else
                throw new IllegalArgumentException(cpf + " é um CPF inválido");
        }
    }

}
