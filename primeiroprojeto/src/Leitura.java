import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu fime favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int ano = leitura.nextInt();
        System.out.println("Diga sua avaliação:");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
