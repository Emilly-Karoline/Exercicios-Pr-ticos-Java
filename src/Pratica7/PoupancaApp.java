package Pratica7;


public class PoupancaApp {
    public static void main(String[] args) {
        Poupanca cliente1 = new Poupanca(2000.00);
        Poupanca cliente2 = new Poupanca(3000.00);

        Poupanca.modificarTaxaDeJurosAnual(0.04);

        for (int mes = 1; mes <= 12; mes++) {
            cliente1.calcularJurosMensais();
            cliente2.calcularJurosMensais();

            System.out.printf(
                    "Mês %d - Cliente 1: R$ %.2f | Cliente 2: R$ %.2f%n",
                    mes,
                    cliente1.getSaldoDaPoupanca(),
                    cliente2.getSaldoDaPoupanca()
            );
        }

        Poupanca.modificarTaxaDeJurosAnual(0.05);

        cliente1.calcularJurosMensais();
        cliente2.calcularJurosMensais();

        System.out.println("\nApós o 13º mês:");
        System.out.printf(
                "Cliente 1: R$ %.2f%n",
                cliente1.getSaldoDaPoupanca()
        );
        System.out.printf(
                "Cliente 2: R$ %.2f%n",
                cliente2.getSaldoDaPoupanca()
        );
    }
}

