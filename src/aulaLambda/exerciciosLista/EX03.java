package aulaLambda.exerciciosLista;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EX03 {

    static void main() {
        // Consumer: takes an object, returns nothing
        Consumer<String> printer = s -> IO.println("Message: " + s);
        IO.println("\n=== Consumer Examples ===");
        printer.accept("Hello Lambda!");
        printer.accept("This is fun!");

        // Supplier: takes no arguments, returns an object
        Supplier<String> greeting = () -> "Welcome to Java!";
        IO.println("\n=== Supplier Examples ===");
        IO.println(greeting.get());
        IO.println(greeting.get());

        // Predicate: takes an object, returns boolean
        Predicate<String> hasThreeChars = s -> s.length() == 3;
        IO.println("=== Predicate Examples ===");
        IO.println("'cat' has 3 chars: " + hasThreeChars.test("cat"));
        IO.println("'dog' has 3 chars: " + hasThreeChars.test("dog"));
        IO.println("'elephant' has 3 chars: " + hasThreeChars.test("elephant"));

        // Function: takes one object, returns another
        Function<String, Integer> getLength = s -> s.length();
        IO.println("\n=== Function Examples ===");
        IO.println("Length of 'Java': " + getLength.apply("Java"));
        IO.println("Length of 'Programming': " + getLength.apply("Programming"));

        // Try creating your own lambdas!
        Predicate<Integer> isEven = num -> num % 2 == 0;
        IO.println("\n=== Your Turn ===");
        IO.println("Is 4 even? " + isEven.test(4));
        IO.println("Is 7 even? " + isEven.test(7));
    }

}
