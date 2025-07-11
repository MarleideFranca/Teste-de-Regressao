package marleidealves;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EspecialidadeTest {

    @Test
    public void testGetNome() {
        Especialidade esp = new Especialidade("Motor");
        assertEquals("Motor", esp.getNome());
    }

    @Test
    public void testSetNome() {
        Especialidade esp = new Especialidade("Motor");
        esp.setNome("freio");
        assertEquals("freio", esp.getNome());
    }

    @Test
    public void testEqualsTrue() {
        Especialidade esp1 = new Especialidade("Elétrica");
        Especialidade esp2 = new Especialidade("Elétrica");
        assertTrue(esp1.equals(esp2));
    }

    @Test
    public void testEqualsFalse() {
        Especialidade esp1 = new Especialidade("Suspensão");
        Especialidade esp2 = new Especialidade("Freio");
        assertFalse(esp1.equals(esp2));
    }
}

