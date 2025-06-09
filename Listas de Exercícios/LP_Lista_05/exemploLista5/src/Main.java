import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração e inicialização da matriz
        int[][] matriz = {
                {5, 8, 9},{9, 6, 5}, {2, 3, 4}};

        // impressão dos elementos da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // pula para a próxima linha
        }
    }
}
