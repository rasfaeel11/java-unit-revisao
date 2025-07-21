package sistema_biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

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
