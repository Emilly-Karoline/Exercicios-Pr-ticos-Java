package pratica3;
import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Informe o numero da sua fatura: ");
        String numeroDaFatura = input.nextLine();
        System.out.printf("Informe a descrição do item: ");
        String descricaoDaFatura = input.nextLine();
        System.out.printf("Informe o valor e a quantidade do item: ");
        double valorItem = input.nextDouble();
        int quantidadeItem = input.nextInt();

        Fatura f =new Fatura(numeroDaFatura,descricaoDaFatura,quantidadeItem,valorItem);

        f.imprimirFatura(numeroDaFatura,descricaoDaFatura,quantidadeItem,valorItem);
input.close();
    }
}
