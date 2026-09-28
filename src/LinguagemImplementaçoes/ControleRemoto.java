package LinguagemImplementaçoes;

public class ControleRemoto {
    public void alterarCanal(Televisao tv, int canal) {
        tv.mudarCanal(canal);}
    public void alterarVolume(Televisao tv) {
        tv.aumentarVolume();}
    public void diminuirVolume(Televisao tv) {
        tv.diminuirVolume();}
}
