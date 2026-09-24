package pratica1;

import java.util.Scanner;
public class Loja {
    public static  double calcularValorFinal(double valor){
        if (valor < 100){return valor;}
        else if (valor >= 100 && valor<=499.99){return valor - (valor * 0.1);}
        else return valor- (valor * 0.15);
    }
     static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = ler.nextDouble();
        System.out.println("O valor final è: " + calcularValorFinal(valorCompra));
        ler.close();
    }
}
