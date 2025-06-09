import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o coeficiente a: ");
        Scanner scanner = new Scanner(System.in);
        double coefA = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double coefB = scanner.nextDouble();
        if (coefA != 0) {
            double x = -coefB / coefA;
            System.out.println("Solução da equação: x = " + x);
        } else {
            System.out.println("Não é uma equação válida.");
        }

    }
}