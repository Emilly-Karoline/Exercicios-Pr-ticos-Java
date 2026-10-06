package pratica4;
/*1. Você está desenvolvendo um sistema simples para uma loja que precisa controlar
produtos em estoque. Crie uma classe Produto com os atributos nome, preco e
quantidade. Implemente diferentes formas de criar produtos (com e sem quantidade
inicial). Inclua métodos para exibir os dados e calcular o valor total em estoque.
Também permita calcular o valor total com desconto.
Crie uma classe AplicacaoProduto que simule o cadastro de alguns produtos e exiba
seus valores totais.*/

public class Produto {
    String nome;
    double preco;
    int quantidade;
    static double precoTotal;
   static int quantidadeTotal;

    public Produto(String nome,double preco,int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
        Produto.precoTotal +=preco*quantidade;
        Produto.quantidadeTotal+=quantidade;}

    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
        this.quantidade+=1;
        Produto.precoTotal +=preco;
        Produto.quantidadeTotal+=1;}

    public void calcularValorTotal(){
        System.out.println("valor total em estoque: "+Produto.precoTotal*Produto.quantidadeTotal);}

    public void calcularValorTotalComDesconto(double porcentagem){
        System.out.printf("valor total do estoque com desconto de %.2f : %.2f", porcentagem,(Produto.precoTotal*Produto.quantidadeTotal)*(1-(porcentagem/100)));

    }

    public void exibirdados(){
        System.out.println("Nome: "+nome);
        System.out.println("Preco: "+preco);
        System.out.println("Quantidade: "+quantidade);
    }
    
}
