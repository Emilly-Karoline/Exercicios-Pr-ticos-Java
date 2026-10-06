package pratica4;

public class AplicacaoCurso {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        Curso curso2 = new Curso("Java Básico");

        Curso curso3 = new Curso("Introdução à Programação", 40, 500);

        System.out.println("===== CURSO 1 =====");
        curso1.exibirCurso();

        System.out.println();

        System.out.println("===== CURSO 2 =====");
        curso2.exibirCurso();

        System.out.println();

        System.out.println("===== CURSO 3 =====");
        curso3.exibirCurso();

        System.out.printf("Valor por hora: R$ %.2f\n", curso3.calcularValorHora());

        System.out.printf("Valor por hora com 10%% de desconto: R$ %.2f\n", curso3.calcularValorHora(10));
    }
}