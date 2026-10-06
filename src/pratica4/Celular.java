package pratica4;

public class Celular {
    String marca;
    String modelo;
    double bateria;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;}

    public Celular(String marca, String modelo, double bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;}


    public void usar(int minutos) {
        bateria = bateria - minutos;

        if (bateria < 0) {
            bateria = 0;}}


    public void usar(int minutos, String aplicativo) {

        double consumo;

        if (aplicativo.equalsIgnoreCase("video")) {
            consumo = 2; // 2% por minuto
        } else if (aplicativo.equalsIgnoreCase("mensagens")) {
            consumo = 0.5; // 0,5% por minuto
        } else {
            consumo = 1; // consumo normal
        }

        bateria = bateria - (minutos * consumo);

        if (bateria < 0) {
            bateria = 0;
        }
    }


    public void recarregar() {
        bateria = 100;
    }


    public double getBateria() {
        return bateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
