import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é R$ 105.540,87");
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar:");
                    double deposito = scanner.nextDouble();
                    System.out.println("Você depositou R$" + deposito);
                    break;
                case 3:
                    System.out.println("Digite o valor a sacar:");
                    double saque = scanner.nextDouble();
                    System.out.println("Você sacou R$" + saque);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                System.out.println("Opção inválida! Escolha entre 1 e 4.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
