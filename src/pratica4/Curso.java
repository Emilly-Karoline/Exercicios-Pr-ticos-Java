package pratica4;

public class Curso {

     String nome;
     int cargaHoraria;
     double valor;

    public Curso() {
        nome = "";
        cargaHoraria = 0;
        valor = 0;
    }

    public Curso(String nome) {
        this.nome = nome;
        cargaHoraria = 0;
        valor = 0;
    }

    public Curso(String nome, int cargaHoraria, double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    public void exibirCurso() {
        System.out.println("Nome: " + nome);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
        System.out.printf("Valor: R$ %.2f\n", valor);
    }

    public double calcularValorHora() {
        return valor / cargaHoraria;
    }

    public double calcularValorHora(double desconto) {

        double valorComDesconto = valor - (valor * desconto / 100);

        return valorComDesconto / cargaHoraria;
    }
}