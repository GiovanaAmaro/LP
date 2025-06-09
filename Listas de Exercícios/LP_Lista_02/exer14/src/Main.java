import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a base do triângulo: ");
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");

        double altura = scanner.nextDouble();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("Área do triângulo: " + areaTriangulo);
    }
}