package marleidealves;

import java.util.ArrayList;
import java.util.List;

public class Mecanico {

    // Atributos
    private String matricula;
    private String nome;
    private List<Especialidade> listaEspecialidades;

    // Construtor
    public Mecanico(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.listaEspecialidades = new ArrayList<>();
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Especialidade> getListaEspecialidades() {
        return listaEspecialidades;
    }

    public void setListaEspecialidades(List<Especialidade> listaEspecialidades) {
        this.listaEspecialidades = listaEspecialidades;
    }

      // Método para verificar se o mecânico é "premium"
    public boolean funcionarioPremium() {
        return listaEspecialidades.size() > 2;
    }
}
