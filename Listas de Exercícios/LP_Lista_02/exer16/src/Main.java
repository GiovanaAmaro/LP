import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o raio do cone: ");
        Scanner scanner = new Scanner(System.in);

        double raioCone = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double alturaCone = scanner.nextDouble();
        double volumeCone = (Math.PI * Math.pow(raioCone, 2) * alturaCone) / 3;
        System.out.println("Volume do cone: " + volumeCone);
    }
}