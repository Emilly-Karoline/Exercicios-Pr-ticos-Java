package pratica1;

import java.util.Scanner;
public class Soma {
    public static int somarAte(int n){
        int resultado = 0;
        for (int i = 1; i <= n; i++){resultado+=i;}
        return resultado;}

    static void main() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();
        System.out.println(somarAte(numero));
        ler.close();
    }

}
