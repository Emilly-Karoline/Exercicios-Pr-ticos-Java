package LinguagemImplementaçoes;

public class Lampada {
    boolean ligada;
    int intensidade;
    public Lampada(boolean ligada, int intensidade) {
        this.ligada = ligada;
        this.intensidade = intensidade;}

    public String ligar(){
      ligada = true;
      return "Ligada";}

    public String desligar(){
        ligada = false;
        intensidade = 0;
        return "Desligada";}

    public void ajustarIntensidade(int novaIntensidade){
        if(ligada==true){
            intensidade = novaIntensidade;}
        else{
            System.out.println("Para alterar a intensidade a lampada deve estar ligada!");}
    }

    public String exibeEstado(){
        String lig_deslig= this.ligada?"Ligada":"Desligada";
        return "Sua lampada está "+ lig_deslig + " com intensidade: "+intensidade;}

}
