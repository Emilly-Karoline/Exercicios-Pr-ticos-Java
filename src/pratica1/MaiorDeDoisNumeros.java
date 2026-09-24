package pratica1;

import java.util.Scanner;

public class MaiorDeDoisNumeros{
    public static int maior (int a, int b){
        if (a > b){return a;}
        else if (b>a){return b;}
        else return a; }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("informe a e b:");
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println("o maior é: " + maior(a,b));
        input.close();
    }

}