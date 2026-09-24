package pratica2;
import java.util.Scanner;
public class MaiorValor {
     public static void main(String[] args) {
         int maiorNumero=0;
         Scanner input = new Scanner(System.in);
         //a variavel contador é o i por ele que vai contabilizar de 1 a 10 o loop sz
         for(int i=1;i<=3;i++) {
             System.out.printf("Digite o %d numero: ",i);
             int numero = input.nextInt();
             if(numero>maiorNumero) {maiorNumero=numero;}
         }input.close();
         System.out.printf("Maior valor: %d",maiorNumero);


    }
}
