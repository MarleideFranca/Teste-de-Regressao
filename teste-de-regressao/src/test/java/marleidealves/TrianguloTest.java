package marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        Triangulo t = new Triangulo(3, 4, 5);
        assertEquals("Triângulo escaleno", t.classificarTriangulo());
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        Triangulo t = new Triangulo(5, 5, 3);
        assertEquals("Triângulo isósceles", t.classificarTriangulo());
    }

    @Test
    public void testTrianguloEquilateroValido() {
        Triangulo t = new Triangulo(4, 4, 4);
        assertEquals("Triângulo equilátero", t.classificarTriangulo());
    }

    @Test
    public void testLadoComValorZero() {
        Triangulo t = new Triangulo(0, 4, 5);
        assertEquals("Triângulo inválido", t.classificarTriangulo());
    }

    @Test
    public void testLadoComValorNegativo() {
        Triangulo t = new Triangulo(-3, 4, 5);
        assertEquals("Triângulo inválido", t.classificarTriangulo());
    }

    @Test
    public void testSomaDeDoisLadosIgualAoTerceiro() {
        Triangulo t = new Triangulo(2, 2, 4);
        assertEquals("Triângulo inválido", t.classificarTriangulo());
    }

    @Test
    public void testCalcularPerimetroValido() {
        Triangulo t = new Triangulo(3.0, 4.0, 5.0); // triângulo escaleno válido
        double esperado = 12.0;
        assertEquals(esperado, t.calculaPerimetro(), 0.0001);
    }

     @Test
    public void testCalcularPerimetroEquilatero() {
        Triangulo t = new Triangulo(5.0, 5.0, 5.0); // triângulo equilátero
        double esperado = 15.0;
        assertEquals(esperado, t.calculaPerimetro(), 0.0001);
    }

    @Test
    public void testCalcularPerimetroIsosceles() {
        Triangulo t = new Triangulo(5.0, 5.0, 3.0); // triângulo isósceles
        double esperado = 13.0;
        assertEquals(esperado, t.calculaPerimetro(), 0.0001);
    }

     @Test
    public void testPerimetroTrianguloInvalido() {
        Triangulo t = new Triangulo(1.0, 2.0, 10.0); // não satisfaz a desigualdade triangular
        Exception excecao = assertThrows(IllegalStateException.class, () -> {
            t.calculaPerimetro();
        });
        assertEquals("Não é possível calcular o perímetro de um triângulo inválido.", excecao.getMessage());
    }
}
