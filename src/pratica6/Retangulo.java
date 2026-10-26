package pratica6;

public class Retangulo {
    private Ponto posicao;
    private double largura;
    private double altura;

    public Retangulo(Ponto posicao, double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException(
                    "A largura e a altura devem ser positivas.");}

        this.posicao = posicao;
        this.largura = largura;
        this.altura = altura;}

    public double calcularArea() {
        return largura * altura;}

    public double calcularPerimetro() {
        return 2 * (largura + altura);}

    public void mover(double deslocamentoX, double deslocamentoY) {
        posicao.mover(deslocamentoX, deslocamentoY);}

    public double getX() {
        return posicao.getX();}

    public double getY() {
        return posicao.getY();}
}
