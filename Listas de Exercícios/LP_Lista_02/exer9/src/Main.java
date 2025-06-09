import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a medida em quilometros: ");
        Scanner scanner = new Scanner(System.in);

        double km = scanner.nextDouble();

        double milhas = km / 1.609;

        System.out.println("Distância em milhas: " + milhas);
    }
}