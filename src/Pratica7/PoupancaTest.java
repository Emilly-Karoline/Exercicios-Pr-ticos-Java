package Pratica7;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoupancaTest {

    @Test
    public void testarInicializacaoDoSaldo() {
        Poupanca conta = new Poupanca(2000.00);

        assertEquals(2000.00, conta.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarJurosDeUmMes() {
        Poupanca.modificarTaxaDeJurosAnual(0.12);
        Poupanca conta = new Poupanca(2000.00);

        conta.calcularJurosMensais();

        assertEquals(2020.00, conta.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarJurosSobreSaldoAtualizado() {
        Poupanca.modificarTaxaDeJurosAnual(0.12);
        Poupanca conta = new Poupanca(2000.00);

        conta.calcularJurosMensais();
        conta.calcularJurosMensais();

        assertEquals(2040.20, conta.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarTaxaAnualZero() {
        Poupanca.modificarTaxaDeJurosAnual(0.0);
        Poupanca conta = new Poupanca(2000.00);

        conta.calcularJurosMensais();

        assertEquals(2000.00, conta.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarSaldoZero() {
        Poupanca.modificarTaxaDeJurosAnual(0.12);
        Poupanca conta = new Poupanca(0.00);

        conta.calcularJurosMensais();

        assertEquals(0.00, conta.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarTaxaCompartilhadaEntreContas() {
        Poupanca.modificarTaxaDeJurosAnual(0.12);
        Poupanca conta1 = new Poupanca(2000.00);
        Poupanca conta2 = new Poupanca(3000.00);

        conta1.calcularJurosMensais();
        conta2.calcularJurosMensais();

        assertEquals(2020.00, conta1.getSaldoDaPoupanca(), 0.000001);
        assertEquals(3030.00, conta2.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarAlteracaoDaTaxaParaContasExistentes() {
        Poupanca.modificarTaxaDeJurosAnual(0.12);
        Poupanca conta1 = new Poupanca(2000.00);
        Poupanca conta2 = new Poupanca(3000.00);

        conta1.calcularJurosMensais();
        conta2.calcularJurosMensais();

        Poupanca.modificarTaxaDeJurosAnual(0.06);

        conta1.calcularJurosMensais();
        conta2.calcularJurosMensais();

        assertEquals(2030.10, conta1.getSaldoDaPoupanca(), 0.000001);
        assertEquals(3045.15, conta2.getSaldoDaPoupanca(), 0.000001);
    }

    @Test
    public void testarIndependenciaDosSaldos() {
        Poupanca.modificarTaxaDeJurosAnual(0.12);
        Poupanca conta1 = new Poupanca(2000.00);
        Poupanca conta2 = new Poupanca(3000.00);

        conta1.calcularJurosMensais();

        assertEquals(2020.00, conta1.getSaldoDaPoupanca(), 0.000001);
        assertEquals(3000.00, conta2.getSaldoDaPoupanca(), 0.000001);
    }
}
/*Após a alteração da taxa anual para 5%, é necessário atualizar cada objeto individualmente?
Explique por que a nova taxa será utilizada pelas duas contas e por que seus saldos continuam
independentes:

Não. Como o atributo taxaDeJurosAnual foi declarado como static, existe apenas uma taxa compartilhada
por todas as instâncias da classe Poupanca. Portanto, quando o metodo Poupanca.modificarTaxaDeJurosAnual(0.05)
é chamado, a nova taxa passa a ser utilizada por todas as contas nos próximos cálculos.

Os saldos, entretanto, continuam independentes, pois saldoDaPoupanca não é estático.
Cada objeto possui seu próprio saldo, e calcular os juros de uma conta não modifica o saldo da outra.

.*/