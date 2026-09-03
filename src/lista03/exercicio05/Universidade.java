package lista03.exercicio05;

public class Universidade {

    public static class Departamento {
        private String nome;
        private int nProfessores;

        public Departamento(String nome, int nProfessores) {
            this.nome = nome;
            this.nProfessores = nProfessores;
        }

        @Override
        public String toString() {
            return "Departamento{" + "nome='" + nome + '\'' + ", nProfessores=" + nProfessores + '}';
        }
    }

}
