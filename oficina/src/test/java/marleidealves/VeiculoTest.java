package marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testGarantiaPickup() {
        Veiculo veiculo = new Veiculo("AAA-1111", "PICKUP", 0, 2020);
        assertEquals(2025, veiculo.calculaGarantia());
    }

    @Test
    public void testGarantiaSUV() {
        Veiculo veiculo = new Veiculo("BBB-2222", "SUV", 1, 2021);
        assertEquals(2024, veiculo.calculaGarantia());
    }

    @Test
    public void testGarantiaPopular() {
        Veiculo veiculo = new Veiculo("CCC-3333", "POPULAR", 2, 2019);
        assertEquals(2021, veiculo.calculaGarantia());
    }

    @Test
    public void testGarantiaTipoMinusculo() {
        Veiculo veiculo = new Veiculo("DDD-4444", "pickup", 0, 2018);
        assertEquals(2023, veiculo.calculaGarantia());
    }

    @Test
    public void testGarantiaTipoDesconhecido() {
        Veiculo veiculo = new Veiculo("EEE-5555", "CAMINHAO", 0, 2022);
        assertEquals(2022, veiculo.calculaGarantia()); // sem garantia
    }

      @Test
    public void testOrdemServicoIncrementaOcorrenciasERegistraMotivo() {
        // Criando o serviço com id=1, matricula mecânico e placa veículo
        Servico servico = new Servico(1, "MAT123", "ABC-1234");

        // Inicialmente, numOcorrencias deve ser 0 e motivo null
        assertEquals(0, servico.getVeiculo().getNumOcorrencias());
        assertNull(servico.getMotivo());

        // Executa ordemServico
        servico.ordemServico("Troca de óleo");

        // Depois da execução:
        // motivo deve ser atualizado
        assertEquals("Troca de óleo", servico.getMotivo());
        // numOcorrencias do veículo deve ser incrementado para 1
        assertEquals(1, servico.getVeiculo().getNumOcorrencias());

        // Executa ordemServico novamente com outro motivo
        servico.ordemServico("Revisão dos freios");

        // motivo atualizado
        assertEquals("Revisão dos freios", servico.getMotivo());
        // numOcorrencias incrementado para 2
        assertEquals(2, servico.getVeiculo().getNumOcorrencias());
    }
}

