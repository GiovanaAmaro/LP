public class Main {
    public static void diagonalPrincipal(int[][] m, int i) {
        if (i == m.length) return;
        System.out.print(m[i][i] + " ");
        diagonalPrincipal(m, i + 1);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        diagonalPrincipal(matriz, 0);
    }
}
