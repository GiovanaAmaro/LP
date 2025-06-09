import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = input.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.print("Sequência de Fibonacci até o " + n + "º termo: ");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro);

            if (i < n - 1) {
                System.out.print(", ");
            }

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
