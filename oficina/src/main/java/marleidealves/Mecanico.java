package marleidealves;

import java.util.ArrayList;
import java.util.List;

public class Mecanico {
    private String id;
    private String nome;
    private String matricula;
    private List<Especialidade> especialidades;

//construtor
public Mecanico(String matricula) {
    this.matricula = matricula;
    this.especialidades = new ArrayList<>();
}


      // Outros construtores
       public Mecanico(String id, String nome, String matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.especialidades = new ArrayList<>(); // ✅ inicialização necessária
    }

    public void adicionarEspecialidade(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }
    /* 
    public boolean funcionarioPremium() {
        return this.especialidades.size() > 2;
    }
    */

    // ✅ NOVA REGRA: premium se tiver mais de uma especialidade
    public boolean funcionarioPremium() {
        return this.especialidades.size() > 1;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

  
}
