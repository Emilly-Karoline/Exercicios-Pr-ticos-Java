package pratica1;

import java.util.Scanner;
public class ClassificacaoDeNumeros {

    public static String classificarNumero(int numero){
        if (numero > 0){return "Positivo";}
        else if (numero < 0){return "Negativo";}
        else return "Zero";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = input.nextInt();
        System.out.println(classificarNumero(numero));
        input.close();
    }


}
