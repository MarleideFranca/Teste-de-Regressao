package marleidealves;

public class Livro {

    // Atributos
    private String nome;
    private int edicao;
    private String autor;
    private String isbn;

    // Construtor
    public Livro(String nome, int edicao, String autor, String isbn) {
        this.nome = nome;
        this.edicao = edicao;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Método verificaLancamento
    public boolean verificaLancamento() {
        return edicao > 2022;
    }
}
