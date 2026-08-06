package aulaEnumerate;

public class Enumerate {

    public static enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}; //Size se torna subclasse de Enum

    public static void main(String[] args) {
        Size tamanho = Size.SMALL;

        if(tamanho == Size.SMALL) {
            System.out.println("Tamanho é SMALL");
            System.out.println("O valor de SMALL no enumerate é: " + Enum.valueOf(Size.class, "SMALL"));
        }

        System.out.print("Constantes do enumerate: ");
        Size[] valores = Size.class.getEnumConstants(); //Tem que usar Size.class pra acessar o método getEnumConstants
        for (Size v : valores) {
            System.out.print(v + ", ");
        }

        System.out.print("\nPosição do valor SMALL na ordem do enumerate: ");
        System.out.println(Size.SMALL.ordinal());

        System.out.print("Posição do valor EXTRA_LARGE na ordem do enumerate: ");
        System.out.println(Size.EXTRA_LARGE.ordinal());
    }

}
