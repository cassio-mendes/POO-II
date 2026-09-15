package listaGenerics.exercicio05;

public class CaixaNumerica<T extends Number> extends Caixa<T> {

    public CaixaNumerica(T valor) { super(valor); }

    public double acessar() { return (Double)this.obter(); }

}
