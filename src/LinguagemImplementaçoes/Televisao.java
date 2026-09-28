package LinguagemImplementaçoes;

public class Televisao {
    int canal;
    int volume;
   public Televisao(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;}

    public void mudarCanal(int novoCanal) {
       this.canal = novoCanal;
        System.out.printf("Canal mudado com sucesso\n");}

    public void aumentarVolume() {
       this.volume+=1;
        System.out.printf("Volume: %d \n", volume);
    }

    public void diminuirVolume() {
       this.volume-=1;
        System.out.printf("Volume: %d \n", volume);}

    public String exibirDados() {
       return "Você está no canal " + this.canal+" Volume: " +this.volume;
    }

}
