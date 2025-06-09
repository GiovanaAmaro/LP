import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            boolean acertouTudo = true;

            // Percorre a tabuada do 1 ao 10
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Você errou! A resposta correta era " + (i * j));
                        acertouTudo = false;
                        break;
                    }
                }
                if (!acertouTudo) break; // sai do laço externo também
            }

            if (acertouTudo) {
                System.out.println("Parabéns! Você completou toda a tabuada sem errar!");
            } else {
                System.out.println("Fim de jogo! Tente novamente.");
            }

            // Pergunta se quer jogar novamente
            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = scanner.next();

            jogarNovamente = resposta.equalsIgnoreCase("s");

        } while (jogarNovamente);

        System.out.println("Obrigado por jogar!");
    }
}
