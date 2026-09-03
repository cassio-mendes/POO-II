package lista03.exercicio14;

public class TestaAnimal {

    static void main(String[] args) {
        fazerSom(new Animal() {
            @Override
            public void fazerSom() {
                System.out.println("AuAU");
            }
        });

        fazerSom(new Animal() {
            @Override
            public void fazerSom() {
                System.out.println("MiauMiau");
            }
        });
    }

    static void fazerSom(Animal a) { a.fazerSom(); }

}
