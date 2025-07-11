public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10}
        };

        int[][] produto = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
            }
        }

        for (int[] linha : produto) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
