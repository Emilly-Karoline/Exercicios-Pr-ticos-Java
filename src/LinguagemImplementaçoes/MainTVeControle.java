package LinguagemImplementaçoes;

public class MainTVeControle {
    public static void main(String[] args) {

        Televisao tv1 = new Televisao(3,0);
        ControleRemoto controle = new ControleRemoto();

        controle.alterarCanal(tv1,18);
        controle.alterarVolume(tv1);
        controle.alterarVolume(tv1);
        controle.diminuirVolume(tv1);
        System.out.printf("%s",tv1.exibirDados());
    }
}
