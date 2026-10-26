package pratica6;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;}

    public String apresentar() {
        return nome + " | " + endereco.formatar();}

    public void atualizarEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;}
}
