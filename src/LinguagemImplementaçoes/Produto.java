package LinguagemImplementaçoes;

public class Produto {
    String nome;
    double preco;
// total produtos deve somar a quantidade de produtos criados,vale para qualquer um obj da classe produto
    static int totalprodutos;
    public Produto() {
        this.nome = "";
        this.preco = 0;
        Produto.totalprodutos++;}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        Produto.totalprodutos++;}

    public String exibirDados(){
        String retorno = "Nome "  + this.nome + "preço " + this.preco + "total produtos: " + Produto.totalprodutos;
        return retorno;
    }

}
