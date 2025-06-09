import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a primeira raiz (x1): ");
        Scanner scanner = new Scanner(System.in);
        double raiz1 = scanner.nextDouble();
        System.out.print("Digite a segunda raiz (x2): ");
        double raiz2 = scanner.nextDouble();
        System.out.println("A equação do segundo grau correspondente é:");
        System.out.println("x² - (" + (raiz1 + raiz2) + ")x + (" + (raiz1 * raiz2) + ") = 0");

    }
}
