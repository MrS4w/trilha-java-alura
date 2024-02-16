//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: The Godfather");

        int anoDeLancamento = 1972;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.8;

        double media = (9.8 + 9.3 + 9) / 3;
        System.out.println(media);
        String sinopse = "O melhor filme de todos os tempos";
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
    }
}