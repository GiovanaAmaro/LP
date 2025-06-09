import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Digite a primeira nota (N1): ");
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (N2): ");

        double n2 = scanner.nextDouble();

        double mediaPonderada = (n1 * 1 + n2 * 2) / 3;

        System.out.println("Média ponderada: " + mediaPonderada);
    }
}