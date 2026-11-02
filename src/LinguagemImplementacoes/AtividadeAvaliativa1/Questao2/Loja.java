package LinguagemImplementacoes.AtividadeAvaliativa1.Questao2;
import java.util.Date;
public class Loja {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Emilly",
                "Rua das Jabitucabeiras, 120 - Centro");

        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 80.00);
        Produto p3 = new Produto("Teclado", 150.00);

        Venda venda = new Venda(new Date(), cliente, 2);

        venda.adicioneProduto(p1);
        venda.adicioneProduto(p2);
        venda.adicioneProduto(p3);

        System.out.println("VENDA REALIZADA");
        System.out.println(venda.imprimeVenda());


        System.out.println("\n TESTANDO O CAIXA ");
        Caixa caixa = new Caixa();
        caixa.abrirVenda(new Date(), cliente);

        caixa.adicionarProduto(p1);
        caixa.adicionarProduto(p2);

        System.out.println("\nVenda atualmente aberta:");
        System.out.println(caixa.getVendaAtual().imprimeVenda());

        caixa.fecharVenda();

        System.out.println("\nQuantidade de vendas registradas: "
                + caixa.getNumVendas());
    }
}

