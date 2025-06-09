import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite temperatura em graus Celsius: ");
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}