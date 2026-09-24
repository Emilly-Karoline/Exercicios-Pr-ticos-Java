package pratica3;
import java.util.Scanner;
public class TrianguloRetangulo {
    double catetoOposto;
    double catetoAdjacente;

    public TrianguloRetangulo(double catetoOposto, double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;}

    public double calcularHipotenusa(){
        double hipotenusa ;
        hipotenusa= Math.sqrt((Math.pow(catetoOposto,2)+Math.pow(catetoAdjacente,2)));
    return hipotenusa;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os valores dos catetos do primeiro triângulo: ");
        double catetoO=input.nextDouble();
        double catetoAdj=input.nextDouble();

        TrianguloRetangulo triangulo1,triangulo2;
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
