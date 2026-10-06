package LinguagemImplementaçoes;

public class AplicacaoProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        System.out.println(p1.exibirDados());
        Produto produto2 = new Produto("esmalte",2.0);
        System.out.println(produto2.exibirDados());
    }
}
