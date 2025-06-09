public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Impressão do vetor em ordem inversa
        System.out.println("Vetor em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
