package LinguagemImplementacoes.AtividadeAvaliativa1.Questao2;
import java.util.Date;

public class Caixa {

    private Venda[] vendas;
    private int numVendas;
    private Venda vendaAtual;

    public Caixa() {
        vendas = new Venda[1];
        numVendas = 0;
        vendaAtual = null;}


    private void aumentarArray() {
        Venda[] novoArray = new Venda[vendas.length * 2];
        for (int i = 0; i < numVendas; i++) {
            novoArray[i] = vendas[i];}
        vendas = novoArray;}


    public void abrirVenda(Date data, Cliente cliente) {
        if (vendaAtual != null) {
            System.out.println("Já existe uma venda aberta!");
            return;}

        if (numVendas == vendas.length) {aumentarArray();}

        vendaAtual = new Venda(data, cliente);
        vendas[numVendas] = vendaAtual;
        numVendas++;}


    public void adicionarProduto(Produto p) {
        if (vendaAtual != null) {vendaAtual.adicioneProduto(p);}
        else {System.out.println("Não existe uma venda aberta!");}}


    public void fecharVenda() {
        if (vendaAtual != null) {
            vendaAtual = null;
            System.out.println("Venda fechada com sucesso!");}
        else {System.out.println("Não existe uma venda aberta!");}
    }

    public Venda getVendaAtual() {return vendaAtual;}

    public Venda getVenda(int i) {
        if (i >= 0 && i < numVendas) {return vendas[i];}

        return null;}

    public int getNumVendas() {return numVendas;}
}

