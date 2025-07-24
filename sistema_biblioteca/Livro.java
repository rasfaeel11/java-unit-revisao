package sistema_biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void cadastroLivro(String tituloLivro, String autorLivro, int anoPublicacaoLivro, double precoLivro){
        this.titulo = tituloLivro;
        this.autor = autorLivro;
        this.anoPublicacao = anoPublicacaoLivro;
        this.preco = precoLivro;
    }
    public double aplicarDesconto(double indexPreco, int percentual){
        double porcentagem = percentual / 100.0;
        double desconto = indexPreco * porcentagem;
        indexPreco -= desconto;
        return indexPreco;
    }
}
