package marleidealves;

public class Veiculo {

    // Atributos
    private String placa;
    private String tipo;
    private int numOcorrencias;
    private int anoFabricacao;

    // Construtor
    public Veiculo(String placa) {
        this.placa = placa;
        this.numOcorrencias = 0;
    }

    public Veiculo(String placa, String tipo, int numOcorrencias, int anoFabricacao) {
        this.placa = placa;
        this.tipo = tipo.toUpperCase(); // normaliza para facilitar a verificação
        this.numOcorrencias = numOcorrencias;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public int getNumOcorrencias() {
        return numOcorrencias;
    }

    public void incrementarOcorrencias() {
        this.numOcorrencias++;
    }

    public void setNumOcorrencias(int numOcorrencias) {
        this.numOcorrencias = numOcorrencias;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método que calcula o ano de expiração da garantia
    public int calculaGarantia() {
        switch (tipo) {
            case "PICKUP":
                return anoFabricacao + 5;
            case "SUV":
                return anoFabricacao + 3;
            case "POPULAR":
                return anoFabricacao + 2;
            default:
                // Se o tipo não for reconhecido, considera sem garantia
                return anoFabricacao;
        }

    }

     // Este método que precisa existir
    public void incrementarOcorrencia() {
        this.numOcorrencias++;
    }

    @Override
    public String toString() {
        return "Veículo [placa=" + placa + ", ocorrências=" + numOcorrencias + "]";
    }

}
