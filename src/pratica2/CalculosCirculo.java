package pratica2;
import java.util.Scanner;
public class CalculosCirculo {

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int raio = input.nextInt();
        System.out.printf("diâmetro: %d \ncomprimento: %.2f\narea: %.2f", 2*raio, 2*Math.PI*raio, Math.PI*(Math.pow(raio, 2)));

        input.close();
    }
}
