import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a medida em polegadas: ");
        Scanner scanner = new Scanner(System.in);

        double pol = scanner.nextDouble();

        double mm2 = pol * 25.4;

        System.out.println("Medida em milímetros: " + mm2);
    }
}