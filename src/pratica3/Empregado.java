package pratica3;

public class Empregado {
    String primeiroNome;
    String sobrenome;
    double salarioMensal;

    public Empregado(String primeiroNome, String sobrenome, double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;}

    public double calcularSalarioAnual(){
        return salarioMensal*12;}

    public void aumentarSalario(double percentual){
        salarioMensal=salarioMensal+(salarioMensal*percentual/100);}

    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
}
