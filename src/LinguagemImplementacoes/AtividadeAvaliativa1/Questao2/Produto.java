package LinguagemImplementacoes.AtividadeAvaliativa1.Questao2;

public class Produto {
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;}

    public String getDescricao() {return descricao;}

    public double getPreco() {return preco;}

    public double getTotal() {return preco;}

    public String imprimeProduto() {return "Produto: " + descricao + " | Preço: R$ " + String.format("%.2f", preco);}
}

