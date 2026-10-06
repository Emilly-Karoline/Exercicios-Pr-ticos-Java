package pratica4;

public class Aluno {
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;}

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;}

    public double calcularMedia (){
        return (this.nota1 + this.nota2) / 2;
    }

    public double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public double calcularMedia(double notaExtra){
        return ((this.nota1 + this.nota2 + notaExtra) / 2);
    }

    public double calcularMedia(double nota1, double nota2, double notaExtra){
        return (nota1 + nota2 + notaExtra) / 2;
    }

    public String exibirAluno(){
        return "Nome: "+ this.nome + " Matricula: " + this.matricula;
    }
}

