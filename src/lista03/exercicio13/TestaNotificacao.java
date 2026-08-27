package lista03.exercicio13;

public class TestaNotificacao {

    static void main() {
        executar(new Notificacao() {
            @Override
            public void mostrarTexto() {
                System.out.println("Texto da notificação");
            }
        });
    }

    static void executar(Notificacao n) {
        n.mostrarTexto();
    }

}
