package marleidealves;

public class Servico {
    private int id;
    private String motivo;
    private Mecanico mecanico;
    private Veiculo veiculo;

    public Servico(int id, String matriculaMecanico, String placaVeiculo) {
        this.id = id;
        this.mecanico = new Mecanico(matriculaMecanico);
        this.veiculo = new Veiculo(placaVeiculo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void ordemServico(String motivo) {
        this.motivo = motivo;
        veiculo.incrementarOcorrencia();
    }

    @Override
    public String toString() {
        return "Serviço [id=" + id + ", motivo=" + motivo + ", " + mecanico + ", " + veiculo + "]";
    }
}
