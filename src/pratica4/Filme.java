package pratica4;

public class Filme {

     String titulo;
     String genero;
     int duracao;

    // Construtor sem parâmetros
    public Filme() {
        titulo = "";
        genero = "";
        duracao = 0;
    }


    public Filme(String titulo) {
        this.titulo = titulo;
        genero = "";
        duracao = 0;
    }


    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }


    public void exibirFilme() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
    }


    public double duracaoEmHoras() {
        return duracao / 60.0;
    }


    public String duracaoEmHoras(boolean formatado) {

        if (formatado) {
            int horas = duracao / 60;
            int minutos = duracao % 60;

            return horas + " horas e " + minutos + " minutos";
        }

        return duracaoEmHoras() + " horas";
    }
}