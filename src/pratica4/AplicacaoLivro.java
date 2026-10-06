package pratica4;
import java.util.Scanner;
public class AplicacaoLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("A Hipótese do amor","Ali Hazelwood",360);
        Livro l2= new Livro("A noiva", 360);

        System.out.println("Informe a quantidade de páginas que você lê por minuto:");
        Scanner sc = new Scanner(System.in);
        double paginasPorMinuto = sc.nextDouble();

        System.out.printf("para ler : %S \nVocê demoraria em média %.2fh\n",l1.getTitulo(),l1.tempoDeLeitura());
        System.out.printf("para ler : %S\nVocê demora %.2fh\n",l2.getTitulo(),l2.tempoDeLeitura(paginasPorMinuto));
        sc.close();


    }
}
