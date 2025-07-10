package marleidealves;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

     @Test
    public void testGetSetNome() {
        Livro livro = new Livro("Java Básico", 2021, "Maria Silva", "1234567890");
        livro.setNome("Java Avançado");
        assertEquals("Java Avançado", livro.getNome());
    }

    @Test
    public void testGetSetEdicao() {
        Livro livro = new Livro("Java Básico", 2021, "Maria Silva", "1234567890");
        livro.setEdicao(2023);
        assertEquals(2023, livro.getEdicao());
    }

    @Test
    public void testGetSetAutor() {
        Livro livro = new Livro("Java Básico", 2021, "Maria Silva", "1234567890");
        livro.setAutor("João Pereira");
        assertEquals("João Pereira", livro.getAutor());
    }

    @Test
    public void testGetSetIsbn() {
        Livro livro = new Livro("Java Básico", 2021, "Maria Silva", "1234567890");
        livro.setIsbn("0987654321");
        assertEquals("0987654321", livro.getIsbn());
    }

    @Test
    public void testVerificaLancamentoTrue() {
        Livro livro = new Livro("Java Básico", 2025, "Maria Silva", "1234567890");
        assertTrue(livro.verificaLancamento());
    }

    @Test
    public void testVerificaLancamentoFalse() {
        Livro livro = new Livro("Java Básico", 2020, "Maria Silva", "1234567890");
        assertFalse(livro.verificaLancamento());
    }
}