public class Exercício77 {
    public static void main(String[] args) {
        int[] v = {1, 5, 4, 2, 7, 8, 3, 6};

        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }

        v[3] = v[1];
        v[v[3]] = v[v[2]];

        // Imprimir o vetor resultante
        for (int elemento : v) {
            System.out.print(elemento + " ");
        }
    }
}
