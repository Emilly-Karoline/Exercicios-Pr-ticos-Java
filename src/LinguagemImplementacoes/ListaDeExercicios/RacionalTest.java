package LinguagemImplementacoes.ListaDeExercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RacionalTest {

    // 1. Testes dos construtores

    @Test
    public void testarValoresPadrao() {
        Racional r = new Racional();

        assertEquals("0/1", r.formatar());
    }

    @Test
    public void testarReducaoFracao() {
        Racional r = new Racional(2, 4);

        assertEquals("1/2", r.formatar());
    }

    @Test
    public void testarFracaoIrredutivel() {
        Racional r = new Racional(3, 7);

        assertEquals("3/7", r.formatar());
    }

    @Test
    public void testarDenominadorNegativo() {
        Racional r = new Racional(2, -4);

        assertEquals("-1/2", r.formatar());
    }

    @Test
    public void testarDoisValoresNegativos() {
        Racional r = new Racional(-2, -4);

        assertEquals("1/2", r.formatar());
    }

    @Test
    public void testarNumeradorZero() {
        Racional r = new Racional(0, 5);

        assertEquals("0/1", r.formatar());
    }

    // 2. Testes do método somar()

    @Test
    public void testarSomaDenominadoresIguais() {
        assertEquals("3/5",
                Racional.somar(new Racional(1, 5),
                        new Racional(2, 5)).formatar());
    }

    @Test
    public void testarSomaDenominadoresDiferentes() {
        assertEquals("5/6",
                Racional.somar(new Racional(1, 2),
                        new Racional(1, 3)).formatar());
    }

    @Test
    public void testarSomaComReducao() {
        assertEquals("1/2",
                Racional.somar(new Racional(1, 6),
                        new Racional(1, 3)).formatar());
    }

    @Test
    public void testarSomaComZero() {
        assertEquals("3/4",
                Racional.somar(new Racional(3, 4),
                        new Racional(0, 1)).formatar());
    }

    @Test
    public void testarSomaValoresOpostos() {
        assertEquals("0/1",
                Racional.somar(new Racional(1, 2),
                        new Racional(-1, 2)).formatar());
    }

    // 3. Testes do método subtrair()

    @Test
    public void testarSubtracaoDenominadoresIguais() {
        assertEquals("3/5",
                Racional.subtrair(new Racional(4, 5),
                        new Racional(1, 5)).formatar());
    }

    @Test
    public void testarSubtracaoDenominadoresDiferentes() {
        assertEquals("5/12",
                Racional.subtrair(new Racional(3, 4),
                        new Racional(1, 3)).formatar());
    }

    @Test
    public void testarSubtracaoComReducao() {
        assertEquals("1/2",
                Racional.subtrair(new Racional(5, 6),
                        new Racional(1, 3)).formatar());
    }

    @Test
    public void testarSubtracaoResultadoNegativo() {
        assertEquals("-1/2",
                Racional.subtrair(new Racional(1, 4),
                        new Racional(3, 4)).formatar());
    }

    @Test
    public void testarSubtracaoValoresIguais() {
        assertEquals("0/1",
                Racional.subtrair(new Racional(2, 3),
                        new Racional(2, 3)).formatar());
    }

    // 4. Testes do método multiplicar()

    @Test
    public void testarMultiplicacaoPositiva() {
        assertEquals("2/5",
                Racional.multiplicar(new Racional(2, 3),
                        new Racional(3, 5)).formatar());
    }

    @Test
    public void testarMultiplicacaoPorZero() {
        assertEquals("0/1",
                Racional.multiplicar(new Racional(3, 4),
                        new Racional(0, 1)).formatar());
    }

    @Test
    public void testarMultiplicacaoPorUm() {
        assertEquals("3/4",
                Racional.multiplicar(new Racional(3, 4),
                        new Racional(1, 1)).formatar());
    }

    @Test
    public void testarMultiplicacaoSinaisDiferentes() {
        assertEquals("-1/2",
                Racional.multiplicar(new Racional(-2, 3),
                        new Racional(3, 4)).formatar());
    }

    @Test
    public void testarMultiplicacaoDoisNegativos() {
        assertEquals("1/2",
                Racional.multiplicar(new Racional(-2, 3),
                        new Racional(-3, 4)).formatar());
    }

    // 5. Testes do método dividir()

    @Test
    public void testarDivisaoPositiva() {
        assertEquals("2/3",
                Racional.dividir(new Racional(1, 2),
                        new Racional(3, 4)).formatar());
    }

    @Test
    public void testarDivisaoComReducao() {
        assertEquals("1/2",
                Racional.dividir(new Racional(2, 3),
                        new Racional(4, 3)).formatar());
    }

    @Test
    public void testarDivisaoPorUm() {
        assertEquals("3/4",
                Racional.dividir(new Racional(3, 4),
                        new Racional(1, 1)).formatar());
    }

    @Test
    public void testarDividendoZero() {
        assertEquals("0/1",
                Racional.dividir(new Racional(0, 1),
                        new Racional(2, 3)).formatar());
    }

    @Test
    public void testarDivisaoSinaisDiferentes() {
        assertEquals("-2/3",
                Racional.dividir(new Racional(1, 2),
                        new Racional(-3, 4)).formatar());
    }

    @Test
    public void testarDivisaoValoresIguais() {
        assertEquals("1/1",
                Racional.dividir(new Racional(2, 3),
                        new Racional(2, 3)).formatar());
    }

    // 6. Testes do método formatar()

    @Test
    public void testarFormatarFracaoPositiva() {
        assertEquals("3/4", new Racional(3, 4).formatar());
    }

    @Test
    public void testarFormatarFracaoNegativa() {
        assertEquals("-3/4", new Racional(-3, 4).formatar());
    }

    @Test
    public void testarFormatarValorInteiro() {
        assertEquals("2/1", new Racional(6, 3).formatar());
    }

    @Test
    public void testarFormatarZero() {
        assertEquals("0/1", new Racional(0, 8).formatar());
    }

    // 7. Testes do método formatar(int casasDecimais)

    @Test
    public void testarConversaoExata() {
        assertEquals("0.50", new Racional(1, 2).formatar(2));
    }

    @Test
    public void testarPreservacaoCasasDecimais() {
        assertEquals("0.2500", new Racional(1, 4).formatar(4));
    }

    @Test
    public void testarDizimaPeriodica() {
        assertEquals("0.333", new Racional(1, 3).formatar(3));
    }

    @Test
    public void testarArredondamentoParaCima() {
        assertEquals("0.67", new Racional(2, 3).formatar(2));
    }

    @Test
    public void testarFormatarNegativoDecimal() {
        assertEquals("-0.75", new Racional(-3, 4).formatar(2));
    }

    @Test
    public void testarFormatarInteiroDecimal() {
        assertEquals("2.00", new Racional(4, 2).formatar(2));
    }

    @Test
    public void testarFormatarSemCasasDecimais() {
        assertEquals("2", new Racional(7, 4).formatar(0));
    }

    @Test
    public void testarFormatarZeroDecimal() {
        assertEquals("0.00", new Racional(0, 5).formatar(2));
    }

    // 8. Testes de preservação dos operandos

    @Test
    public void testarPreservacaoOperandosSoma() {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(1, 3);

        Racional resultado = Racional.somar(a, b);

        assertEquals("1/2", a.formatar());
        assertEquals("1/3", b.formatar());
        assertNotSame(a, resultado);
        assertNotSame(b, resultado);
    }

    @Test
    public void testarPreservacaoOperandosSubtracao() {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(1, 3);

        Racional resultado = Racional.subtrair(a, b);

        assertEquals("1/2", a.formatar());
        assertEquals("1/3", b.formatar());
        assertNotSame(a, resultado);
        assertNotSame(b, resultado);
    }

    @Test
    public void testarPreservacaoOperandosMultiplicacao() {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(1, 3);

        Racional resultado = Racional.multiplicar(a, b);

        assertEquals("1/2", a.formatar());
        assertEquals("1/3", b.formatar());
        assertNotSame(a, resultado);
        assertNotSame(b, resultado);
    }

    @Test
    public void testarPreservacaoOperandosDivisao() {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(1, 3);

        Racional resultado = Racional.dividir(a, b);

        assertEquals("1/2", a.formatar());
        assertEquals("1/3", b.formatar());
        assertNotSame(a, resultado);
        assertNotSame(b, resultado);
    }
}

