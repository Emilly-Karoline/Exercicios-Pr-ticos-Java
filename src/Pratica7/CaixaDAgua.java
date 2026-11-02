package Pratica7;


public class CaixaDAgua {
    private double capacidade;
    private double quantidadeAtual;

    // Construtor sem argumentos
    public CaixaDAgua() {
        this.capacidade = 1000.0;
        this.quantidadeAtual = 0.0;}

    // Construtor com capacidade personalizada
    public CaixaDAgua(double capacidade) {
        if (capacidade <= 0) {
            this.capacidade = 1000.0;}
        else {
            this.capacidade = capacidade;}

        this.quantidadeAtual = 0.0;}

    public double getCapacidade() {
        return capacidade;}

    public double getQuantidadeAtual() {
        return quantidadeAtual;}

    public double adicionarAgua(double quantidade) {
        if (quantidade <= 0) {
            return 0.0;}

        double espacoDisponivel = capacidade - quantidadeAtual;
        double quantidadeAdicionada = Math.min(
                quantidade, espacoDisponivel);

        quantidadeAtual += quantidadeAdicionada;

        return quantidadeAdicionada;}

    public double retirarAgua(double quantidade) {
        if (quantidade <= 0) {
            return 0.0;}

        double quantidadeRetirada = Math.min(
                quantidade, quantidadeAtual);

        quantidadeAtual -= quantidadeRetirada;

        return quantidadeRetirada;}

    public double calcularPercentualOcupado() {
        return (quantidadeAtual / capacidade) * 100;}
}
