package marleidealves;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributos
    private String nome;
    private String cnpj;
    private int anoFundacao;
    // atributo ListaLivros do tipo ArrayList para integração
    private List<Livro> listaLivros;

    // Construtor
    public Biblioteca(String nome, String cnpj, int anoFundacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
    //Construtor para integração
     this.listaLivros = new ArrayList<>();
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

     // Método para adicionar livro
    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    // Método para remover livro
    public void removerLivro(Livro livro) {
        listaLivros.remove(livro);
    }

    // Método que indica se é patrimônio histórico
    public boolean patrimonioHistorico() {
        return anoFundacao < 1980;
    }

    // Método acervoPremium: pelo menos 5 livros lançamentos
    public boolean acervoPremium() {
        int contadorLancamentos = 0;
        for (Livro livro : listaLivros) {
            if (livro.verificaLancamento()) {
                contadorLancamentos++;
            }
            if (contadorLancamentos >= 5) {
                return true;
            }
        }
        return false;
    }
}