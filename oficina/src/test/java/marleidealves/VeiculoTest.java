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
}

