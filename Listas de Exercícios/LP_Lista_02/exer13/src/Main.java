import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o raio do círculo: ");
        Scanner in = new Scanner(System.in);

        double raio = in.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("Área do círculo: " + areaCirculo);

    }
}