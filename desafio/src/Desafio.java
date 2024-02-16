import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Victor";
        String tipoConta = "Conta Corrente";
        double saldo = 1371.62;
        int opcao = 0;

        System.out.println("***************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("***************");

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir valor");
            System.out.println("3 - Receber valor");
            System.out.println("4 - Sair");
            System.out.println("Digite sua opção: ");

            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor deseja transferir?");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: R$ "+ saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
