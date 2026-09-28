package pratica3;
import java.util.Scanner;
public class DateApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Informe a data no formato (dia/mes/ano): ");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();

        Date data = new Date(dia,mes,ano);
        Date data2 = new Date(dia,mes,ano);

        data.displayDate();
        data2.displayDate();

        System.out.printf("\nalterando a data no dia:\n");
        data.dia = input.nextInt();
        data.displayDate();
        input.close();
    }
}
