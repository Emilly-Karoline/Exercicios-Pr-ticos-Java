package pratica6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainRetangulo {
    @Test
    public void testarArea() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        assertEquals(12.0, retangulo.calcularArea(), 0.001);}

    @Test
    public void testarPerimetro() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        assertEquals(14.0, retangulo.calcularPerimetro(), 0.001);}

    @Test
    public void testarPosicaoInicial() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        assertEquals(2.0, retangulo.getX(), 0.001);
        assertEquals(5.0, retangulo.getY(), 0.001);}

    @Test
    public void testarDeslocamentoPositivo() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        retangulo.mover(3, 4);

        assertEquals(5.0, retangulo.getX(), 0.001);
        assertEquals(9.0, retangulo.getY(), 0.001);}

    @Test
    public void testarDeslocamentoNegativo() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        retangulo.mover(-4, -6);

        assertEquals(-2.0, retangulo.getX(), 0.001);
        assertEquals(-1.0, retangulo.getY(), 0.001);}

    @Test
    public void testarDeslocamentoZero() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        retangulo.mover(0, 0);

        assertEquals(2.0, retangulo.getX(), 0.001);
        assertEquals(5.0, retangulo.getY(), 0.001);}

    @Test
    public void testarMovimentacoesSucessivas() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        retangulo.mover(3, 4);
        retangulo.mover(-1, 2);

        assertEquals(4.0, retangulo.getX(), 0.001);
        assertEquals(11.0, retangulo.getY(), 0.001);}

    @Test
    public void testarPreservacaoDimensoes() {
        Retangulo retangulo = new Retangulo(new Ponto(2, 5), 4, 3);

        retangulo.mover(10, -2);

        assertEquals(12.0, retangulo.calcularArea(), 0.001);
        assertEquals(14.0, retangulo.calcularPerimetro(), 0.001);}

    @Test
    public void testarIndependenciaEntreRetangulos() {
        Retangulo primeiro = new Retangulo(new Ponto(2, 5), 4, 3);
        Retangulo segundo = new Retangulo(new Ponto(10, 20), 6, 2);

        primeiro.mover(3, 4);

        assertEquals(5.0, primeiro.getX(), 0.001);
        assertEquals(9.0, primeiro.getY(), 0.001);

        assertEquals(10.0, segundo.getX(), 0.001);
        assertEquals(20.0, segundo.getY(), 0.001);}
}
