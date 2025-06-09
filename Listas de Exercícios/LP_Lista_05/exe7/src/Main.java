public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 4, 1, 5, 3},
                {1, 3, 4, 2, 6},
                {7, 2, 5, 4, 1},
                {9, 3, 2, 6, 0},
                {8, 1, 3, 2, 4}
        };

        int maiorSomaLinha = 0;
        int maiorSomaColuna = 0;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            int somaColuna = 0;

            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }

            if (somaLinha > maiorSomaLinha) maiorSomaLinha = somaLinha;
            if (somaColuna > maiorSomaColuna) maiorSomaColuna = somaColuna;
        }

        System.out.println("Maior soma das linhas: " + maiorSomaLinha);
        System.out.println("Maior soma das colunas: " + maiorSomaColuna);
    }
}
