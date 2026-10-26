package pratica6;

public class Motor {
    private int potencia;
    private boolean ligado;

    public Motor(int potencia) {
        this.potencia = potencia;
        this.ligado = false;}

    public void ligar() {
        ligado = true;}

    public void desligar() {
        ligado = false;}

    public boolean estaLigado() {
        return ligado;}

    public int getPotencia() {
        return potencia;}
}
