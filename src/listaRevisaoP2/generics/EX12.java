package listaRevisaoP2.generics;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() { return this.nome; }

    @Override
    public String toString() { return this.getNome(); }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome) {
        super(nome);
    }
}

class ArquitetoSoftware extends Funcionario {
    public ArquitetoSoftware(String nome) {
        super(nome);
    }
}

class EspecialistaSeguranca extends Desenvolvedor {
    public EspecialistaSeguranca(String nome) {
        super(nome);
    }
}

class EspecialistaBackEnd extends Desenvolvedor {
    public EspecialistaBackEnd(String nome) {
        super(nome);
    }
}

class ScrumMaster extends ArquitetoSoftware {
    public ScrumMaster(String nome) {
        super(nome);
    }
}

class ScrumOwner extends ArquitetoSoftware {
    public ScrumOwner(String nome) {
        super(nome);
    }
}


public class EX12 {

    static void main() {
        EspecialistaSeguranca es = new EspecialistaSeguranca("Jorge");
        EspecialistaBackEnd eb = new EspecialistaBackEnd("Manoel");
        ScrumOwner so = new ScrumOwner("Beatriz");
        ScrumMaster sm = new ScrumMaster("Letícia");

        List<Funcionario> list = new ArrayList<>();
        addElements(list, es, eb, so, sm);

        System.out.println(list);
    }

    static void addElements(List<? super Funcionario> list, Funcionario... f) {
        list.addAll(List.of(f));
    }

}
