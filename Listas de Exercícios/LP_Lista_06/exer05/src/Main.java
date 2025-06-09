public class Main{
    public static void inverter(int[] vetor, int i) {
        int j = vetor.length - 1 - i;
        if (i >= j) return;

        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;

        inverter(vetor, i + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        inverter(vetor, 0);

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
