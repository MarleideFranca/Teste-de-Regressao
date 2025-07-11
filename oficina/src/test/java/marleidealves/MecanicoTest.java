package marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MecanicoTest {

    @Test
    public void testFuncionarioPremiumComMaisDeDuasEspecialidades() {
        Mecanico mecanico = new Mecanico("123", "João", "MAT001");
        mecanico.adicionarEspecialidade(new Especialidade("Motor"));
        mecanico.adicionarEspecialidade(new Especialidade("Freio"));
        mecanico.adicionarEspecialidade(new Especialidade("Suspensão"));

        assertTrue(mecanico.funcionarioPremium());
    }

    @Test
    public void testFuncionarioPremiumComExatamenteDuasEspecialidades() {
        Mecanico mecanico = new Mecanico("456", "Maria", "MAT002");
        mecanico.adicionarEspecialidade(new Especialidade("Motor"));
        mecanico.adicionarEspecialidade(new Especialidade("Elétrica"));

        assertFalse(mecanico.funcionarioPremium());
    }

    @Test
    public void testFuncionarioPremiumSemEspecialidades() {
        Mecanico mecanico = new Mecanico("789", "Carlos", "MAT003");

        assertFalse(mecanico.funcionarioPremium());
    }

    @Test
    public void testGetMatricula() {
        Mecanico mecanico = new Mecanico("101", "Ana", "MAT004");
        assertEquals("MAT004", mecanico.getMatricula());
    }

    @Test
    public void testSetMatricula() {
        Mecanico mecanico = new Mecanico("102", "Pedro", "MAT005");
        mecanico.setMatricula("MAT999");
        assertEquals("MAT999", mecanico.getMatricula());
    }
}
