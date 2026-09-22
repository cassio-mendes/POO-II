package lista4.exercicio03;

import java.util.Date;

public class Funcionario implements Cloneable {

    private String nome;
    private double salario;
    private Date dataAdmissao;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = new Date();
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public Cloneable clone() {
        try {
            Funcionario f = (Funcionario)super.clone();
            f.dataAdmissao = (Date) this.dataAdmissao.clone();
            return f;

        } catch(CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
