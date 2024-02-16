public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1972;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.8;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2022) {
            System.out.println("Filme novo");
        } else {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Pode assistir");
        } else {
            System.out.println("Necessário pagamento");
        }
    }
}
