package Pratica7;


public class Poupanca {

    private double saldoDaPoupanca;
    private static double taxaDeJurosAnual = 0.0;

    public Poupanca(double saldoInicial) {
        this.saldoDaPoupanca = saldoInicial;
    }

    public double getSaldoDaPoupanca() {
        return saldoDaPoupanca;
    }

    public static void modificarTaxaDeJurosAnual(double novaTaxa) {
        taxaDeJurosAnual = novaTaxa;
    }

    public void calcularJurosMensais() {
        double juros = saldoDaPoupanca * taxaDeJurosAnual / 12;
        saldoDaPoupanca += juros;
    }
}
