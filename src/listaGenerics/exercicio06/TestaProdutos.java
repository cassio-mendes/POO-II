package listaGenerics.exercicio06;

public class TestaProdutos {

    static void main() {
        Produto p1 = new Produto("A", 12.0);
        Produto p2 = new Produto("B", 12.0);
        Produto p3 = new Produto("C", 15.2);

        Produto maior = maior(p1, p2);
        System.out.println("Preço: " + maior.getPreco());

        maior = maior(p1, p3);
        System.out.println("Preço: " + maior.getPreco());

        //maior(new Servico(), new Servico()); Não compila porque Servico não implementa Comparable
    }

    static <T extends Comparable & Identificavel> T maior(T obj1, T obj2) {
        T resultado;

        if(obj1.compareTo(obj2) > 0 || obj1.compareTo(obj2) == 0) resultado = obj1;
        else resultado = obj2;

        System.out.println("ID do maior: " + resultado.getId());
        return resultado;
    }

}
