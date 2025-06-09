    import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();

        System.out.println("""
            Menu:
            1. Café Expresso R$ 0.50
            2. Café Longo R$ 1.00
            3. Capuccino R$ 2.50
            4. Chocolate R$ 2.00
        """);
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        String bebida = "";
        double preco = 0;

        switch (opcao) {
            case 1 -> { bebida = "Café Expresso"; preco = 0.50; }
            case 2 -> { bebida = "Café Longo"; preco = 1.00; }
            case 3 -> { bebida = "Capuccino"; preco = 2.50; }
            case 4 -> { bebida = "Chocolate"; preco = 2.00; }
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }

        if (dinheiro >= preco) {
            double troco = dinheiro - preco;
            System.out.printf("Bebida selecionada: %s\nSeu troco: R$ %.2f\n", bebida, troco);
        } else {
            System.out.println("Dinheiro insuficiente.");
        }
    }
}
