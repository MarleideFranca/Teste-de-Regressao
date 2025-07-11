package marleidealves;

import java.util.Objects;

public class Especialidade {
    private String nome;

    public Especialidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Especialidade)) return false;
        Especialidade that = (Especialidade) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
