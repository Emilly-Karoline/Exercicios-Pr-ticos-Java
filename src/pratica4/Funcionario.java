package pratica4;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(){
        this.nome = "";
        this.cargo = "";
        this.salario = 0;}

    public Funcionario(String nome){
        this.nome = nome;
        this.cargo = "";
        this.salario = 0;}

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;}


    void aumentarSalario(double percentual){
        this.salario = this.salario + (this.salario*(percentual/100));
    }

    void
    aumentarSalario(double percentual, double bonus){
        this.salario = this.salario + (this.salario*(percentual/100)) + bonus;}

    void exibirDados(){
        System.out.printf("Nome: %S\n",this.nome);
        System.out.printf("Salario:%.2f \n",this.salario);
        System.out.printf("\n");}
}
