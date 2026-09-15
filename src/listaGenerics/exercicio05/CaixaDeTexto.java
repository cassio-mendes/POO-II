package listaGenerics.exercicio05;

public class CaixaDeTexto extends Caixa<String> {

    public String acessar() { return (String)this.obter(); }

}
