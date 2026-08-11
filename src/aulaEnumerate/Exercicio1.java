package aulaEnumerate;

public class Exercicio1 {
    
    private static enum TipoDePonto {
        VITORIA(100), ABATE(20), ITEM_ESPECIAL(5); //Cada constante tem um valor associado

        private final int pontos; //Pontuação da constante atual

        private TipoDePonto(int pontos) { //Construtor obrigatório
            this.pontos = pontos;
        }

        public int getPontos() { return this.pontos; } //Retorna pontuação da constante
    };
    
    private static class Jogador {

        private int totalPontos = 0;

        public void adicionarPontos(TipoDePonto... tipos) { //Quantidade variável de tipos usando varargs (essencialmente um array)

            for (TipoDePonto t : tipos) {
                this.totalPontos += t.getPontos(); //Soma a pontuação do valor de cada constante
            }
        }

        public int getTotalPontos() { return totalPontos; }
    }

    public static void main(String[] args) {
        Jogador j = new Jogador(); //Novo jogador

        //Cada parâmetro é uma constante do enum com seu próprio valor associado, que será retornado pelo getPontos()
        j.adicionarPontos(TipoDePonto.VITORIA, TipoDePonto.ABATE, TipoDePonto.ITEM_ESPECIAL);
        
        System.out.println("Pontuação final: " + j.getTotalPontos()); //Resultado final
    }

}
