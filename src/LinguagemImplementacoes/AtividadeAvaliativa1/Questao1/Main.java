package LinguagemImplementacoes.AtividadeAvaliativa1.Questao1;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println("BARALHO ORIGINAL");
        baralho.imprimeBaralho();

        System.out.println("\nBARALHAR");
        baralho.embaralha();
        baralho.imprimeBaralho();

        System.out.println("\nRETIRAR CARTA");
        Carta carta = baralho.daCarta();

        if (carta != null) {carta.exibirCarta();}
        else {System.out.println("O baralho está vazio!");}

        System.out.println("\nVERIFICAÇÃO DE CARTA");

        if (baralho.temCarta()) {System.out.println("Ainda existem cartas no baralho.");}
        else {System.out.println("O baralho está vazio.");}

        System.out.println("\nQuantidade de cartas restantes:");

        int contador = 0;
        while (baralho.temCarta()) {
            baralho.daCarta();
            contador++;}
        System.out.println("Cartas retiradas: " + contador);
        System.out.println("O baralho está vazio? " + !baralho.temCarta());
    }
}
