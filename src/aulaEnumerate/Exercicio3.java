package aulaEnumerate;

public class Exercicio3 {
    
    private static enum Atividade {
        PROJETO(0.4), TRABALHO(0.2), PROVA_PRATICA(0.3), PROVA_TEORICA(0.1);

        private double peso;

        private Atividade(double peso) {
            this.peso = peso;
        }

        private static void validar(double nota) throws ValorInvalidoException {
            if(nota > 10.0)
                throw new ValorInvalidoException("ERRO: nota maior que 10");

            else if(nota < 0.0)
                throw new ValorInvalidoException("ERRO: nota menor que 0");
        }

        public static String calcularMediaPonderada(Atividade[] atividades, double... valorAvaliacao) 
            throws PesosInvalidosException, ValorInvalidoException, ArrayIndexOutOfBoundsException {
            
            //Verifica se os pesos são válidos
            double pesos = 0.0;
            for (Atividade a : atividades) {
                pesos += (a.peso * 10);     //Multiplicamos por 10 para evitar erros de precisão de ponto flutuante
                System.out.println(pesos);
            }

            pesos /= 10; //Corrigimos o valor final
            if(pesos != 1.0) { throw new PesosInvalidosException(); }

            //Calcula a media ponderada de todas as atividades
            double soma = 0.0;
            pesos = 0.0; //Reseta a soma dos pesos

            for (int i = 0; i < atividades.length; i++) {
                validar(valorAvaliacao[i]); //Verifica se a nota é válida

                //Se não disparar a exceção, prossegue com o cálculo
                soma += (valorAvaliacao[i] * atividades[i].peso);
                pesos += atividades[i].peso;
            }

            return "Média ponderada das atividades: " + (soma/pesos);
        }
    }

    public static void main(String[] args) {
        
        //Parâmetros
        Atividade[] atividades = {Atividade.PROJETO, Atividade.TRABALHO, Atividade.PROVA_PRATICA, Atividade.PROVA_TEORICA};
        String resposta = Atividade.calcularMediaPonderada(atividades, 8.0, 6.0, 5.5, 7.0);

        System.out.println(resposta); //Resultado final
    }

}
