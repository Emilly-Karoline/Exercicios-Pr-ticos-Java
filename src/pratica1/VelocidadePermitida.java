package pratica1;

import  java.util.Scanner;
public class VelocidadePermitida {
    public static  String checaVelocidadePermitida(double velocidade){
        if(velocidade>80.0){return "A cima da Velocidade-permitida";}
        else if (velocidade==80) {return "Velocidade-permitida";}
        else return "Abaixo da Velocidade-permitida";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a velocidade: ");
        double velocidadePermitida=input.nextDouble();
        System.out.println("O velocidade esta: "+checaVelocidadePermitida(velocidadePermitida));
        input.close();
    }
}
