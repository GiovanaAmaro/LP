import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a medida em milhas: ");
        Scanner scanner = new Scanner(System.in);

        double milhas = scanner.nextDouble();

        double km = milhas * 1.609;

        System.out.println("Distância em quilometros: " + km);
    }
}