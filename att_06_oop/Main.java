package att_06_oop;

public class Main{
  public static void main(String[] args) {
    Estoque estoque = new Estoque();
    Estoque.Produto produto = estoque.new Produto(01, "limpeza", 15.50, 10);

    System.out.println(produto.getQtdeEmEstoque());
    System.out.println(estoque.aumentarEstoque(produto, 15));
    System.out.println(estoque.baixarEstoque(produto, 7));
    System.out.println(estoque.baixarEstoque(produto, 10));
    System.out.println(produto.getQtdeEmEstoque());
    System.out.println(estoque.calcularValorEstoque(produto));


  }
}