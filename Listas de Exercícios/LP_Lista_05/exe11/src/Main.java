import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas da matriz A: ");
        int linA = sc.nextInt();
        System.out.print("Colunas da matriz A: ");
        int colA = sc.nextInt();

        System.out.print("Linhas da matriz B: ");
        int linB = sc.nextInt();
        System.out.print("Colunas da matriz B: ");
        int colB = sc.nextInt();

        if (colA != linB) {
            System.out.println("Multiplicação impossível: colunas de A devem ser iguais às linhas de B.");
            return;
        }

        int[][] A = new int[linA][colA];
        int[][] B = new int[linB][colB];

        System.out.println("Insira os valores da matriz A:");
        for (int i = 0; i < linA; i++)
            for (int j = 0; j < colA; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Insira os valores da matriz B:");
        for (int i = 0; i < linB; i++)
            for (int j = 0; j < colB; j++)
                B[i][j] = sc.nextInt();

        int[][] produto = new int[linA][colB];

        for (int i = 0; i < linA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz produto:");
        for (int[] linha : produto) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
