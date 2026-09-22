package aulaClone.exercicio04;

import java.util.Arrays;

public class ListaClonavel<T> implements Cloneable {

    private Object[] elementos;
    private int tamanho = 0;

    public ListaClonavel() {
        this.elementos = new Object[]{};
    }

    private ListaClonavel(Object[] elementos, int tamanho) {
        this.elementos = elementos;
        this.tamanho = tamanho;
    }

    public void add(T element) {
        Object[] novo = new Object[this.elementos.length + 1];

        for (int i = 0; i < this.elementos.length; i++)
            novo[i] = elementos[i];

        novo[novo.length-1] = element;
        this.elementos = novo;
        this.tamanho++;
    }

    public T get(int index) {
        return index >= this.elementos.length ? null : (T)this.elementos[index];
    }

    public void remove(T obj) {
        Object[] novo = new Object[this.elementos.length];
        int cont = 0;

        for (int i = 0; i < this.elementos.length; i++) {
            if(!(this.elementos[i].equals(obj))) {
                novo[cont] = this.elementos[i];
            }
        }

        if(Arrays.equals(novo, this.elementos)) { //obj não existe em elementos
            System.out.println("O elemento não está na lista");
        } else {
            System.out.println("Elemento removido");

            this.elementos = Arrays.copyOfRange(novo, 0, novo.length - 1);
            this.tamanho--;
        }
    }

    public int size() { return this.tamanho; }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < this.elementos.length; i++) {
            s += this.elementos[i].toString();
            if(i < this.elementos.length - 1) s += ", ";
        }
        s += "]";

        return s;
    }

    @Override
    public Cloneable clonar() {
        return new ListaClonavel<T>(this.elementos, this.tamanho);
    }
}
