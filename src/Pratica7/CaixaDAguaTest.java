package Pratica7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaixaDAguaTest {

    @Test
    public void testarConstrucaoPadrao() {
        CaixaDAgua caixa = new CaixaDAgua();

        assertEquals(1000.0, caixa.getCapacidade(), 0.000001);
        assertEquals(0.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarCapacidadePersonalizada() {
        CaixaDAgua caixa = new CaixaDAgua(200.0);

        assertEquals(200.0, caixa.getCapacidade(), 0.000001);
        assertEquals(0.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarCapacidadeZero() {
        CaixaDAgua caixa = new CaixaDAgua(0.0);

        assertEquals(1000.0, caixa.getCapacidade(), 0.000001);
    }

    @Test
    public void testarCapacidadeNegativa() {
        CaixaDAgua caixa = new CaixaDAgua(-50.0);

        assertEquals(1000.0, caixa.getCapacidade(), 0.000001);
    }

    @Test
    public void testarAdicaoDentroDaCapacidade() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);

        double resultado = caixa.adicionarAgua(30.0);

        assertEquals(30.0, resultado, 0.000001);
        assertEquals(30.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarAdicaoAcimaDaCapacidade() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);
        caixa.adicionarAgua(80.0);

        double resultado = caixa.adicionarAgua(30.0);

        assertEquals(20.0, resultado, 0.000001);
        assertEquals(100.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarAdicaoEmCaixaCheia() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);
        caixa.adicionarAgua(100.0);

        double resultado = caixa.adicionarAgua(10.0);

        assertEquals(0.0, resultado, 0.000001);
        assertEquals(100.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarAdicaoInvalida() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);
        caixa.adicionarAgua(40.0);

        double resultadoZero = caixa.adicionarAgua(0.0);
        double resultadoNegativo = caixa.adicionarAgua(-10.0);

        assertEquals(0.0, resultadoZero, 0.000001);
        assertEquals(0.0, resultadoNegativo, 0.000001);
        assertEquals(40.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarRetiradaComAguaSuficiente() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);
        caixa.adicionarAgua(60.0);

        double resultado = caixa.retirarAgua(25.0);

        assertEquals(25.0, resultado, 0.000001);
        assertEquals(35.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarRetiradaAcimaDaQuantidadeDisponivel() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);
        caixa.adicionarAgua(20.0);

        double resultado = caixa.retirarAgua(35.0);

        assertEquals(20.0, resultado, 0.000001);
        assertEquals(0.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarRetiradaDeCaixaVazia() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);

        double resultado = caixa.retirarAgua(10.0);

        assertEquals(0.0, resultado, 0.000001);
        assertEquals(0.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarRetiradaInvalida() {
        CaixaDAgua caixa = new CaixaDAgua(100.0);
        caixa.adicionarAgua(40.0);

        double resultadoZero = caixa.retirarAgua(0.0);
        double resultadoNegativo = caixa.retirarAgua(-10.0);

        assertEquals(0.0, resultadoZero, 0.000001);
        assertEquals(0.0, resultadoNegativo, 0.000001);
        assertEquals(40.0, caixa.getQuantidadeAtual(), 0.000001);
    }

    @Test
    public void testarPercentualOcupado() {
        CaixaDAgua caixa = new CaixaDAgua(200.0);
        caixa.adicionarAgua(50.0);

        assertEquals(
                25.0,
                caixa.calcularPercentualOcupado(),
                0.000001
        );
    }

    @Test
    public void testarIndependenciaEntreObjetos() {
        CaixaDAgua caixa1 = new CaixaDAgua(100.0);
        CaixaDAgua caixa2 = new CaixaDAgua(200.0);

        caixa1.adicionarAgua(30.0);

        assertEquals(30.0, caixa1.getQuantidadeAtual(), 0.000001);
        assertEquals(0.0, caixa2.getQuantidadeAtual(), 0.000001);
    }
}
