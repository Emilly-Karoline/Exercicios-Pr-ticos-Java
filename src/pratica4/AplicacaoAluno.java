package pratica4;

public class AplicacaoAluno {
    public static void main(String[] args) {

        Aluno aluno1 =new Aluno("Emilly", "001",9.0,10.0);
        Aluno aluno2 =new Aluno("Rykelmy", "002");

        System.out.println(aluno1.exibirAluno());
        System.out.println("com média : "+ aluno1.calcularMedia());
        System.out.println("Recebeu nota extra: " + aluno1.calcularMedia(0.5));

        System.out.println(aluno2.exibirAluno());
        System.out.println("com média : "+ aluno2.calcularMedia(8.5,8));
        System.out.println("Recebeu nota extra: "+ aluno2.calcularMedia(8.5,8,0.5));




    }
}
