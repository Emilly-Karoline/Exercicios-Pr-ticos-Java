package pratica4;

public class AplicacaoFilme {
    public static void main(String[] args) {


        Filme filme1 = new Filme();

        Filme filme2 = new Filme("Interestelar");

        Filme filme3 = new Filme("O Senhor dos Anéis", "Fantasia", 150);

        System.out.println("===== FILME 1 =====");
        filme1.exibirFilme();
        System.out.printf("Duração em horas: %.2f\n" , filme1.duracaoEmHoras());
        System.out.printf("Duração formatada: %S\n" , filme1.duracaoEmHoras(true));

        System.out.println();

        System.out.println("===== FILME 2 =====");
        filme2.exibirFilme();
        System.out.printf("Duração em horas: %.2f\n" , filme2.duracaoEmHoras());
        System.out.printf("Duração formatada: %S\n" , filme2.duracaoEmHoras(false));


        System.out.println();

        System.out.println("===== FILME 3 =====");
        filme3.exibirFilme();
        System.out.printf("Duração em horas: %.2f\n" , filme3.duracaoEmHoras());
        System.out.printf("Duração formatada: %S\n" , filme3.duracaoEmHoras(true));

    }
}
