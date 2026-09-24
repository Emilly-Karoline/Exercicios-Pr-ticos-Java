package pratica2;
import java.util.Scanner;

public class ContagemDeNumeros {
    public static void main(String[] args) {
        int positivo=0;
        int negativo=0;
        int nulo = 0;
        Scanner input = new Scanner(System.in);

        for (int i =1; i <= 5; i++) {
            System.out.printf("Digite o %d numero: ", i);
            int numero = input.nextInt();
            if (numero > 0){positivo++;}
            else if (numero < 0){negativo++;}
            else nulo++;
            }input.close();
        System.out.printf("Quantidade de Positivos: %d\nQuantidade de Negativos: %d\nQuantidade de Nulos: %d", positivo, negativo,nulo);
    }
}
