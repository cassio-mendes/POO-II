package lista02;

public class Ex02 {

    public static class Endereco {
        private int numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String CEP;
        private String estado;
        private Logradouro logradouro;

        private class Logradouro {
            String tipo, nome;

            public void exibirEndereco() {
                System.out.println(numero);
            }
        }
    }

}
