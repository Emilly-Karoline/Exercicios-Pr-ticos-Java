package pratica2;
import java.util.Scanner;
public class ConversorParaDecimal {
    public static void main(String[] args) {
        /*converter de binario para decimal*/
        int decimal=0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o numero em binário: ");
        String numeroBinario = input.nextLine();
        for( int i=0 ; i<numeroBinario.length() ; i++){
            decimal=decimal*2;
            if(numeroBinario.charAt(i)=='1'){decimal=decimal+1;}
        }input.close();
        System.out.printf("O numero binário %s é %d em decimal",numeroBinario,decimal);


    }
}
