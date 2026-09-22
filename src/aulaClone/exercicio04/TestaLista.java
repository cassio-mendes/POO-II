package aulaClone.exercicio04;

public class TestaLista {

    static void main() {
        ListaClonavel<String> lista = new ListaClonavel<>();
        lista.add("AAA");
        lista.add("BBB");

        System.out.println("Elementos: " + lista);
        System.out.println("Tamanho: " + lista.size());

        lista.remove("AAA");
        System.out.println("\nLista após remover AAA: " + lista);
        System.out.println("Novo Tamanho: " + lista.size());

        ListaClonavel<String> listaClone = (ListaClonavel<String>) lista.clonar();
        System.out.println("\nLista Clonada: " + listaClone);
        System.out.println("Tamanho do Clone: " + listaClone.size());
    }

}
