package pratica3;

public class Fatura {
    String fatura;
    String descricao;
    int quantidade;
    double preco;

    public Fatura(String fatura, String descricao, int quantidade, double preco) {
        this.fatura = fatura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;}
    public double calcularValorFatura(){
        if (quantidade <= 0 || preco <= 0){
            return 0;}
        else {return preco*quantidade;}}
    public void imprimirFatura(String fatura ,String descricao, int quantidade, double preco){
        System.out.printf("numero da fatura: %S\n",fatura);
        System.out.printf("descrição: %s\n",descricao);
        System.out.printf("quantidade comprada: %d\n",quantidade);
        System.out.printf("preço por quantidade: %.2f\n",preco);
        System.out.printf("Valor total da fatura: %.2f\n",this.calcularValorFatura());
    }
}
