package pratica2;
import java.util.Scanner;
public class Calculadora {
    public double operacao(double num1,double num2){
        double resultado = num1+num2;
        return resultado;}

    public double operacao(int num1,double num2){
        double resultado = num1-num2;
        return resultado;}

    public double operacao(double num1, int num2){
        double resultado = num1*num2;
        return resultado;}
    public double operacao(int num1, short num2){
        double resultado = num1%num2;
        return resultado;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro numero: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = input.nextDouble();
        //soma d d
        System.out.println(calc.operacao(num1,num2));
        //sub i d
        System.out.println(calc.operacao((int)num1,num2));
        //mul d i
        System.out.println(calc.operacao(num1,(int)num2));
        //div i short
        System.out.println(calc.operacao((int)num1,(short)num2));
        input.close();



    }
}
