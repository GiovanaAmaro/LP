public static int somaDeUmAteN(int N) {
    if (N <= 0) {
        throw new IllegalArgumentException("N deve ser maior que 0.");
    }
    return N * (N + 1) / 2;
}
