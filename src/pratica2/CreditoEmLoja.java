package pratica2;
import java.util.Scanner;
public class CreditoEmLoja {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.printf("Informe os dados da sua conta:\nO numero da sua conta:");
        int conta=input.nextInt();

        System.out.printf("Seu saldo inicial do mês: \n");
        int saldoInicial=input.nextInt();

        System.out.printf("Suas despesas do mês: \n");
        int despesas=input.nextInt();

        System.out.printf("O valor de créditos gastos no mês: \n");
        int credito=input.nextInt();

        System.out.printf("O seu limite de créditos: \n");
        int limitCredito=input.nextInt();

        int novoSaldo=saldoInicial+despesas-credito;

        if(novoSaldo<=limitCredito){System.out.printf("O cliente %d, não exedeu o limite de créditos\nSeu novo saldo é: %d", conta,novoSaldo);}
        else
            System.out.printf("Limite de crédito exedido!");



         input.close();


    }
}
