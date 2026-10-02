package aulaLambda.exercicios;

import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;

public class aula01_10 {

    static void main() {
        //Ex01:  ( 3 ), ( 4 ), ( 1 ), ( 2 )

        //Ex02: IntBinaryOperator max = Integer::max;
        //O metodo `max` pertence à classe `Integer` e é estático, portanto é invocado
        //diretamente a partir do tipo da classe (`RefType`)

        //Ex03: Function<User, String> getName = User::getName;
        //O objeto `user` é o próprio parâmetro recebido pela lambda. Trata-se de
        //uma instância não explicitada (*unbound*), onde se utiliza o nome do tipo (`User`)
        //seguido do metodo (`::getName`)

        //Ex04: Supplier<List<String>> newListOfStrings = ArrayList::new;
        //Explicação: O operador `::new` substitui a chamada explícita ao construtor com o
        //operador `new`.

        //Ex05:
        //Consumer<String> printer = s -> System.out.println(s);
        Consumer<String> printer = System.out::println;
        printer.accept("Resposta do exercício 5");

        //Ex06:
        //DoubleUnaryOperator sqrt = a -> Math.sqrt(a);
        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println("Raiz de 16.0 = " + sqrt.applyAsDouble(16));
    }

}
