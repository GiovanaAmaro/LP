import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Números naturais entre " + num1 + " e " + num2 + ":");

        int inicio = Math.min(num1, num2) + 1;
        int fim = Math.max(num1, num2);

        boolean encontrou = false;

        for (int i = inicio; i < fim; i++) {
            if (i >= 0) { // Só exibe números naturais (0 ou positivos)
                System.out.print(i + " ");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum número natural entre os valores informados.");
        }
    }
}
