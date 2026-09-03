package lista03.exercicio12;

public class TestaNotificacao {

    static void main(String[] args) {
        Notificacao n = new Notificacao() {

            @Override
            public void enviar() {
                System.out.println("Notificação enviada!");
            }
        };

        n.enviar();
    }

}
