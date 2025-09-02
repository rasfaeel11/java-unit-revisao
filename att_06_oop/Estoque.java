package att_06_oop;

public class Estoque {
  class Produto{
    private int codigo;
    private String descricao;
    private double precoCusto;
    private int qtdeEmEstoque;
    
    public double getPrecoCusto() {
      return precoCusto;
    }

    public int getQtdeEmEstoque() {
      return qtdeEmEstoque;
    }

    public Produto(int codigo, String descricao, double precoCusto, int qtdeEmEstoque) {
      this.codigo = codigo;
      this.descricao = descricao;
      this.precoCusto = precoCusto;
      this.qtdeEmEstoque = qtdeEmEstoque;
    }
  }
  public int aumentarEstoque(Produto produto, int qtdAdicionada){
    return produto.qtdeEmEstoque =+ qtdAdicionada;
  }
  public int baixarEstoque(Produto produto, int qtdRemovida){
    if(qtdRemovida > produto.qtdeEmEstoque) return -1;
    int aux = produto.qtdeEmEstoque - qtdRemovida;
    if(aux < 0) return 0;
    return produto.qtdeEmEstoque - qtdRemovida;
  }

  public double calcularValorEstoque(Produto produto){
    return produto.qtdeEmEstoque * produto.precoCusto;
  }

  
}
