package sistema_biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void cadastroLivro(String tituloLivro, String autorLivro, int anoPublicacaoLivro, double precoLivro){
        this.titulo = tituloLivro;
        this.autor = autorLivro;
        this.anoPublicacao = anoPublicacaoLivro;
        this.preco = precoLivro;
    }
}
