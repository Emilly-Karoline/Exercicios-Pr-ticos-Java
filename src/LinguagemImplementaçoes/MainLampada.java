package LinguagemImplementaçoes;
import java.util.Scanner;
public class MainLampada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lampada lamp = new Lampada(false,0);
        lamp.ligar();
        lamp.ajustarIntensidade(10);
        System.out.printf("%s\n",lamp.exibeEstado());
        lamp.desligar();
        System.out.printf("%s\n",lamp.exibeEstado());

    }
}
