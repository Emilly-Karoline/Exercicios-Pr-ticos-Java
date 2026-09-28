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



}
