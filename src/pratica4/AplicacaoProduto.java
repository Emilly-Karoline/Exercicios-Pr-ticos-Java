package pratica4;

public class AplicacaoProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("esmate", 5.99, 2);
        Produto produto2 = new Produto("body Splash", 20);
        produto1.exibirdados();
        produto2.exibirdados();
        produto1.calcularValorTotal();
        produto1.calcularValorTotalComDesconto(10);

    }
}
