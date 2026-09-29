package aulaLambda.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExerciciosLambda {
    static void main(String[] args) {


// EXERCÍCIO 1 -
//
// Crie uma lambda que receba dois números e retorne asoma.
// Crie uma interface funcional se achar necessário.

        //Interface funcional que recebe dois valores de tipo T e retorna outro de mesmo tipo
        BinaryOperator<Integer> resultado = (n1, n2) -> (n1 + n2);

        System.out.println("Ex01: Soma = " + resultado.apply(5, 6));

// EXERCÍCIO 2 -
//
// Crie uma lambda que receba dois números inteiros
// e retorne o maior.
// Crie uma interface funcional se achar necessário.
//

        BinaryOperator<Integer> maior = (n1, n2) -> (n1 > n2 || n1.equals(n2)) ? n1 : n2;
        System.out.println("Ex02: Maior entre 5 e 4 -> " + maior.apply(5, 4));

// EXERCÍCIO 3 -

// Use uma expressão lambda dentro do sort()
// para ordenar os números em ordem crescente.
// Consulte o mtodo sort() de List, antes de resolver
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 10, 3);

        //Interface funcional (Comparator) que compara o valor de dois números (compareTo)
        numeros.sort((n1, n2) -> n1 - n2);

        System.out.println("Ex03 -> Números: " + numeros);
//

// EXERCÍCIO 4 -
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 3500),
                new Produto("Mouse", 100),
                new Produto("Teclado", 250),
                new Produto("Monitor", 1200)
        );

// Use uma expressão lambda dentro do sort()
// para ordenar os produtos pelo preço, do menor
// para o maior.
// produtos.sort((a, b) -> __________________);

        //Comparator
        produtos.sort((a, b) -> a.getPreco() - b.getPreco());

        System.out.println("Ex04 -> Produtos:");
        for (Produto produto : produtos) {
            System.out.println(
                    produto.getNome() + " - " + produto.getPreco()
            );
        }
    }
}

class Produto {
    private String nome;
    private int preco;
    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public int getPreco() {
        return preco;
    }

}

