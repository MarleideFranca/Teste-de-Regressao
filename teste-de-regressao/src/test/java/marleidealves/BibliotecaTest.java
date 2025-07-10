package marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    public void testGetSetNome() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "12345678000199", 1995);
        biblioteca.setNome("Biblioteca Municipal");
        assertEquals("Biblioteca Municipal", biblioteca.getNome());
    }

    @Test
    public void testGetSetCnpj() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "12345678000199", 1995);
        biblioteca.setCnpj("00987654000188");
        assertEquals("00987654000188", biblioteca.getCnpj());
    }

    @Test
    public void testGetSetAnoFundacao() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "12345678000199", 1995);
        biblioteca.setAnoFundacao(2000);
        assertEquals(2000, biblioteca.getAnoFundacao());
    }

    @Test
    public void testPatrimonioHistoricoTrue() {
        Biblioteca biblioteca = new Biblioteca("Antiga Biblioteca", "11222333000100", 1945);
        assertTrue(biblioteca.patrimonioHistorico());
    }

    @Test
    public void testPatrimonioHistoricoFalse() {
        Biblioteca biblioteca = new Biblioteca("Nova Biblioteca", "22334455000111", 2000);
        assertFalse(biblioteca.patrimonioHistorico());
    }

    @Test
    public void testAcervoPremium() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Moderna", "33445566000122", 2010);

        // Adiciona 5 livros lançamentos (edição > 2022)
        biblioteca.adicionarLivro(new Livro("Livro 1", 2023, "Autor A", "0001"));
        biblioteca.adicionarLivro(new Livro("Livro 2", 2024, "Autor B", "0002"));
        biblioteca.adicionarLivro(new Livro("Livro 3", 2025, "Autor C", "0003"));
        biblioteca.adicionarLivro(new Livro("Livro 4", 2023, "Autor D", "0004"));
        biblioteca.adicionarLivro(new Livro("Livro 5", 2024, "Autor E", "0005"));

        // Deve retornar true
        assertTrue(biblioteca.acervoPremium());
    }

    @Test
    public void testAcervoPremiumFalse() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Simples", "99887766000133", 2000);
 // Apenas 3 livros lançamentos
        biblioteca.adicionarLivro(new Livro("Livro 1", 2021, "Autor A", "0001"));
        biblioteca.adicionarLivro(new Livro("Livro 2", 2022, "Autor B", "0002"));
        biblioteca.adicionarLivro(new Livro("Livro 3", 2023, "Autor C", "0003"));

        // Deve retornar false
        assertFalse(biblioteca.acervoPremium());

    } // ← chave de fechamento do método
}  // ← chave de fechamento da classe