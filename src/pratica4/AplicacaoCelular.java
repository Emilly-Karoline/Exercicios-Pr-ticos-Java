package pratica4;

public class AplicacaoCelular {

    public static void main(String[] args) {

        Celular celular1 = new Celular("Samsung", "Galaxy S23");

        Celular celular2 = new Celular("Apple", "iPhone 15", 80);

        System.out.println("Bateria do celular 1: " + celular1.getBateria() + "%");
        System.out.println("Bateria do celular 2: " + celular2.getBateria() + "%");


        celular1.usar(10);
        System.out.println("Depois de usar por 10 minutos: "
                + celular1.getBateria() + "%");


        celular1.usar(20, "video");
        System.out.println("Depois de assistir vídeo por 20 minutos: "
                + celular1.getBateria() + "%");


        celular2.usar(10, "mensagens");
        System.out.println("Celular 2 depois de usar mensagens: "
                + celular2.getBateria() + "%");


        celular1.recarregar();
        System.out.println("Celular 1 depois de recarregar: "
                + celular1.getBateria() + "%");
    }
}