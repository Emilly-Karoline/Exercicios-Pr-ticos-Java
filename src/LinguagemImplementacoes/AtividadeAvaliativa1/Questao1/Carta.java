package LinguagemImplementacoes.AtividadeAvaliativa1.Questao1;

public class Carta {
    private String nome;
    private String naipe;

    public String getNome() {return nome;}
    public String getNaipe() {return naipe;}

    public Carta(String nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;}
    public Carta() {
        this.nome = "";
        this.naipe = "";}

    public void exibirCarta() {
        System.out.println(nome + " de " + naipe);}
}
