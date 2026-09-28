package pratica3;

public class Date {
    int dia;
    int mes;
    int ano;

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;}

    public void displayDate(){
        System.out.printf("%d/%d/%d \n",dia,mes,ano);}

}
