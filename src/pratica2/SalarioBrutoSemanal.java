package pratica2;
import java.util.Scanner;
public class SalarioBrutoSemanal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1;i<=3;i++ ){
            double salarioBruto=0;
            double horasExtras=0;

            System.out.printf("\nOlá funcionario %d\nPor favor informe a quantidade de horas semanais trabalhadas:\n",i);

            int horasSemanais=input.nextInt();

            System.out.printf("Agora informe o valor recebido por hora: \n");

            int valorHora = input.nextInt();

            if(horasSemanais>40){
                horasExtras = (horasSemanais - 40)*(valorHora*1.5);
                salarioBruto = (40* valorHora) + horasExtras;
                System.out.printf("Seu salario bruto é de : %.2f\n", salarioBruto);}
            else System.out.printf("Seu salario bruto é de: %d", horasSemanais*valorHora);}input.close();
    }
}
