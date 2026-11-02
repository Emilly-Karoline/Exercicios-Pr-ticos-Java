package LinguagemImplementacoes.ListaDeExercicios;

public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this(0, 1);}


    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException(
                    "O denominador não pode ser zero.");
        }

        if (numerador == 0) {
            this.numerador = 0;
            this.denominador = 1;}

        else {int divisor = calcularMDC(numerador, denominador);

            numerador /= divisor;
            denominador /= divisor;


            if (denominador < 0) {
                numerador = -numerador;
                denominador = -denominador;}

            this.numerador = numerador;
            this.denominador = denominador;}
    }


    private static int calcularMDC(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;}
        return a;}


    public static Racional somar(Racional a, Racional b) {
        int num = a.numerador * b.denominador
                + b.numerador * a.denominador;

        int den = a.denominador * b.denominador;

        return new Racional(num, den);}


    public static Racional subtrair(Racional a, Racional b) {
        int num = a.numerador * b.denominador
                - b.numerador * a.denominador;

        int den = a.denominador * b.denominador;

        return new Racional(num, den);}


    public static Racional multiplicar(Racional a, Racional b) {
        int num = a.numerador * b.numerador;
        int den = a.denominador * b.denominador;

        return new Racional(num, den);}


    public static Racional dividir(Racional a, Racional b) {
        int num = a.numerador * b.denominador;
        int den = a.denominador * b.numerador;

        return new Racional(num, den);}


    public String formatar() {
        return numerador + "/" + denominador;}


    public String formatar(int casasDecimais) {
        java.math.BigDecimal numeradorDecimal =
                new java.math.BigDecimal(numerador);

        java.math.BigDecimal denominadorDecimal =
                new java.math.BigDecimal(denominador);

        java.math.BigDecimal resultado =
                numeradorDecimal.divide(denominadorDecimal, casasDecimais, java.math.RoundingMode.HALF_UP);

        return resultado.toPlainString();}

}
