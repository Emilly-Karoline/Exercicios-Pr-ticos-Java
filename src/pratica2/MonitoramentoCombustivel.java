package pratica2;
import java.util.Scanner;
public class MonitoramentoCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kmTotal=0;
        int litrosTotal=0;

        System.out.print("Informe o KM (use -1 para sair)");
        int km=input.nextInt();
        while(km!=-1) {
            System.out.printf("Informe os Litros: ");
            int litros=input.nextInt();
            //a
            double consumo = (double) km/litros;
            //b,c
            kmTotal+=km;
            litrosTotal+=litros;
            //a
            System.out.printf("O consumo deste tanque foi de %.2f km/litros\n",consumo);
            System.out.printf("Informe o KM do novo tanque(use -1 para sair)");
            km=input.nextInt();}input.close();

        System.out.printf("O consumo médio acumulado de todos os tanques foi de: %.2f\n",(double)kmTotal/litrosTotal);


    }
}
