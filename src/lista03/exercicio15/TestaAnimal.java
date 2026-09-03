package lista03.exercicio15;

public class TestaAnimal {

    static void main(String[] args) {
        //A classe anônima seria mais útil para implementar um único metodo, enquanto a classe local poderia implementar
        //mais funcionalidades
        classeAnonima();
        classeLocal();
    }

    static void classeAnonima() {
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

    static void classeLocal() {
        class Cachorro extends Animal {
            @Override
            public void fazerSom() {
                System.out.println("AuAu");
            }
        }

        Cachorro c = new Cachorro();
        c.fazerSom();

        class Gato extends Animal {
            @Override
            public void fazerSom() {
                System.out.println("MiauMiau");
            }
        }

        Gato g = new Gato();
        g.fazerSom();
    }

    static void fazerSom(Animal a) { a.fazerSom(); }

}
