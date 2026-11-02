package LinguagemImplementacoes.AtividadeAvaliativa1.Questao1;

public class Baralho {

    private Carta[] cartas;
    private int quantidade;

    public Baralho() {
        cartas = new Carta[56];
        quantidade = 0;

        String[] naipes = {"copas", "ouros", "espadas", "paus"};
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String naipe : naipes) {
            for (String nome : nomes) {
                cartas[quantidade] = new Carta(nome, naipe);
                quantidade++;}}

        for (int i = 0; i < 4; i++) {
            cartas[quantidade] = new Carta("coringa", "coringa");
            quantidade++;}}

    public void embaralha() {
        for (int i = 0; i < 1000; i++) {
            int posicao1 = (int) (Math.random() * quantidade);
            int posicao2 = (int) (Math.random() * quantidade);
            Carta auxiliar = cartas[posicao1];
            cartas[posicao1] = cartas[posicao2];
            cartas[posicao2] = auxiliar;}}

    public Carta daCarta() {
        if (temCarta()) {
            Carta cartaRetirada = cartas[quantidade - 1];
            cartas[quantidade - 1] = null;
            quantidade--;
            return cartaRetirada;}
        return null;}

    public void imprimeBaralho() {
        for (int i = 0; i < quantidade; i++) {
            cartas[i].exibirCarta();}}

    public boolean temCarta() {
        return quantidade > 0;}
}