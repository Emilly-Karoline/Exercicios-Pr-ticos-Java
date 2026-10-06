package pratica4;

public class AplicacaoFuncionario {
    static void main() {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Emilly","Recepcionista",1000);
        Funcionario f3 = new Funcionario("Rykelmy");

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();

        f1.aumentarSalario(50,300);
        f2.aumentarSalario(100);
        f3.aumentarSalario(10, 1000);

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();





    }
}
