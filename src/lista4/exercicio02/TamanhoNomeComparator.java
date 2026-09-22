package lista4.exercicio02;

import java.util.Comparator;

public class TamanhoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        int n1 = o1.getNome().length();
        int n2 = o2.getNome().length();

        if(n1 > n2) return 1;
        else if(n1 < n2) return -1;
        else return 0;
    }
}
