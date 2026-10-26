package pratica6;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;}

    public void mover(double deslocamentoX, double deslocamentoY) {
        x += deslocamentoX;
        y += deslocamentoY;}

    public double getX() {
        return x;}

    public double getY() {
        return y;}
}
