import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o coeficiente a: ");
        Scanner scanner = new Scanner(System.in);
        double a2 = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b2 = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c2 = scanner.nextDouble();

        double delta = Math.pow(b2, 2) - 4 * a2 * c2;

        if (delta >= 0) {
            double x1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
            double x2 = (-b2 - Math.sqrt(delta)) / (2 * a2);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }

    }
}