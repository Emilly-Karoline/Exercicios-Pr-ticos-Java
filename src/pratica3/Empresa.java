package pratica3;
import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


        Empregado[] empregados = new Empregado[2];
        for (int i = 0; i<2; i++){

            System.out.printf("Funcionario %d \nInforme o seu Nome: \n",i+1);
            String nome = input.nextLine();
            System.out.printf("\nInforme seu sobrenome: \n");
            String sobrenome = input.nextLine();
            System.out.printf("\nInforme seu salario mensal: \n");
            double salario = input.nextDouble();
            input.nextLine();
            empregados[i] = new Empregado(nome, sobrenome, salario);}

        for (int i =0; i<2; i++){
    System.out.println(
            "Funcionario " + empregados[i].getPrimeiroNome()+ " " + empregados[i].getSobrenome() +
                    " Recbe anualmente : R$"+ empregados[i].calcularSalarioAnual()
    );
}

        for (int i =0; i<2; i++){
            empregados[i].aumentarSalario(10);}

        for (int i =0; i<2; i++){
            System.out.println(
                    "Funcionario " + empregados[i].getPrimeiroNome()+ " " + empregados[i].getSobrenome() +
                            " Recbe anualmente (novo salario): R$"+ empregados[i].calcularSalarioAnual()
            );
        }

    input.close();
    }
}
