import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a velocidade inicial (m/s): ");
        Scanner scanner = new Scanner(System.in);

        double vi = scanner.nextDouble();

        System.out.print("Digite a aceleração (m/s²): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (s): ");
        double t = scanner.nextDouble();

        double vf = vi + a * t;

        System.out.println("Velocidade final: " + vf + " m/s");
    }
}