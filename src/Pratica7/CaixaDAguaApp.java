package Pratica7;


public class CaixaDAguaApp {
    public static void main(String[] args) {

        CaixaDAgua caixa1 = new CaixaDAgua(100.0);
        CaixaDAgua caixa2 = new CaixaDAgua(200.0);

        // Operações na primeira caixa
        caixa1.adicionarAgua(80.0);
        caixa1.retirarAgua(20.0);

        // Operações na segunda caixa
        caixa2.adicionarAgua(50.0);
        caixa2.retirarAgua(10.0);

        // Apresentação dos resultados
        System.out.println("Caixa 1:");
        System.out.println("Capacidade: " + caixa1.getCapacidade());
        System.out.println("Quantidade atual: "
                + caixa1.getQuantidadeAtual() + " litros");
        System.out.println("Percentual ocupado: "
                + caixa1.calcularPercentualOcupado() + "%");

        System.out.println("\nCaixa 2:");
        System.out.println("Capacidade: " + caixa2.getCapacidade());
        System.out.println("Quantidade atual: "
                + caixa2.getQuantidadeAtual() + " litros");
        System.out.println("Percentual ocupado: "
                + caixa2.calcularPercentualOcupado() + "%");
    }
}

