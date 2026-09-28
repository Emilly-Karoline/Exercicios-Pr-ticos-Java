package pratica3;

import java.util.Scanner;

public class MainTrianguloRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TrianguloRetangulo triangulo1,triangulo2;

        System.out.println("Informe os valores dos catetos do primeiro triângulo: ");
        double catetoO=input.nextDouble();
        double catetoAdj=input.nextDouble();

        triangulo1 = new TrianguloRetangulo(catetoO,catetoAdj);
        System.out.printf("o valor da hipotenusa do primeiro triangulo é: %.2f\n",triangulo1.calcularHipotenusa());

        System.out.printf("Informe os valores dos catetos do segundo triângulo: ");
        catetoO= input.nextDouble();
        catetoAdj= input.nextDouble();
        triangulo2 = new TrianguloRetangulo(catetoO,catetoAdj);
        System.out.printf("O valor da hipotenusa do segundo triângulo é: %.2f",triangulo2.calcularHipotenusa());
        input.close();
    }
}
