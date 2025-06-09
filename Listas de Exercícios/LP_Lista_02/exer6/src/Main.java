import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");

        double kmh = scanner.nextDouble();

        double ms = kmh / 3.6;

        System.out.println("Velocidade em km/s: " + ms);
    }
}