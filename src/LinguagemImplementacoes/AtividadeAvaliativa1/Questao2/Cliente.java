package LinguagemImplementacoes.AtividadeAvaliativa1.Questao2;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome) {
        this.nome = nome;
        this.endereco = "Não informado";}

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;}

    public String getNome() {return nome;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String imprimeCliente() {return "Cliente: " + nome + " | Endereço: " + endereco;}
}
