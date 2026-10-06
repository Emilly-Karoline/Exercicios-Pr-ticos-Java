package pratica4;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;}
    public Livro(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;}

    public double tempoDeLeitura(){
        return ((this.paginas/2)/60);}

    public double tempoDeLeitura(double paginasPorMinuto){
        return ((this.paginas/paginasPorMinuto)/60);}

    public String getTitulo() {
        return titulo;}
}
