package LinguagemImplementacoes.AtividadeAvaliativa1.Questao2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Venda {
    private Date data;
    private Cliente cliente;
    private Produto[] produtos;
    private int numProdutos;

    public Venda(Date data) {
        this.data = data;
        this.cliente = null;
        this.produtos = new Produto[1];
        this.numProdutos = 0;}


    public Venda(Date data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.produtos = new Produto[1];
        this.numProdutos = 0;}


    public Venda(Date data, Produto[] produtos) {
        this(data);
        if (produtos != null) {
            this.produtos = new Produto[Math.max(1, produtos.length)];
            for (Produto p : produtos) {
                if (p != null) {
                    adicioneProduto(p);} } } }


    public Venda(Date data, int capacidadeMaxima) {
        this.data = data;
        this.cliente = null;

        if (capacidadeMaxima > 0) {this.produtos = new Produto[capacidadeMaxima];}
        else {this.produtos = new Produto[1];}
        this.numProdutos = 0;}


    public Venda(Date data, Cliente cliente, Produto[] produtos) {
        this(data, produtos);
        this.cliente = cliente;}


    public Venda(Date data, Cliente cliente, int capacidadeMaxima) {
        this(data, capacidadeMaxima);
        this.cliente = cliente;}


    private void aumentarArray() {
        Produto[] novoArray = new Produto[produtos.length * 2];
        for (int i = 0; i < numProdutos; i++) {
            novoArray[i] = produtos[i];}
        produtos = novoArray;}


    public void adicioneProduto(Produto p) {
        if (p == null) {return;}

        if (numProdutos == produtos.length) {aumentarArray();}
        produtos[numProdutos] = p;
        numProdutos++;}


    public double getTotal() {
        double total = 0;
        for (int i = 0; i < numProdutos; i++) {total += produtos[i].getTotal();}
        return total;}

    public Produto getProduto(int i) {
        if (i >= 0 && i < numProdutos) {
            return produtos[i];}
        return null;}

    public int getNumProdutos() {return numProdutos;}

    public Cliente getCliente() {return cliente;}

    public Date getData() {return data;}


    public String imprimeVenda() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String resultado = "Data: " + formato.format(data) + "\n";

        if (cliente != null) {resultado += cliente.imprimeCliente() + "\n";}
        resultado += "\nProdutos:\n";

        for (int i = 0; i < numProdutos; i++) {resultado += produtos[i].imprimeProduto() + "\n";}
        resultado += "\nTotal da venda: R$ " +
                String.format("%.2f", getTotal());

        return resultado;}
}

