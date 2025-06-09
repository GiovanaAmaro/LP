import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 12, 23, 7, 18, 2, 11, 9, 4, 20};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }
}
