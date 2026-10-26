package pratica6;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;}

    public void ligar() {
        motor.ligar();}

    public void desligar() {
        motor.desligar();}

    public boolean estaLigado() {
        return motor.estaLigado();}

    public boolean acelerar() {
        if (motor.estaLigado()) {
            return true;}

        return false;}

    public String getModelo() {
        return modelo;}

    public Motor getMotor() {
        return motor;}
}
