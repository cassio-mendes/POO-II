package aulaPrintf;

public class Formatacoes {

    public static void main(String[] args) {
        int inteiro = 15;
        double decimal = 15.0;
        char c = 'A';

        System.out.printf("Número inteiro: %d\n", inteiro);
        System.out.printf("Número com vírgula: %.2f\n", decimal); //.2 -> duas casas decimais
        System.out.printf("String: %s\n", decimal);
        System.out.printf("Caracter: %c\n", c);
        System.out.printf("Decimal em notação científica: %.2e\n", decimal);
        
    }

}
