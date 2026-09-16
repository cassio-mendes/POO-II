package listaGenerics.exercicio03;

public class Utilidade {

    //Um metodo genérico recebe argumentos de um tipo qualquer que herde de Object e pode retornar valores desse mesmo
    //tipo. Paralelamente, um metodo que recebe e retorna Object também será "genérico", com a diferença de que será
    //necessário fazer cast no objeto retornado para descobrir seu tipo de instância.
    public static <T>T primeiro(T[] array) throws IllegalArgumentException {
        if(array == null || array.length == 0) throw new IllegalArgumentException("Array vazio.");
        else return array[0];
    }

}
