public class Exercício76 {
    public static void main(String[] args) {
        int largura = 60;
        int altura = 10;

        for (int linha = 1; linha <= altura; linha++) {
            for (int coluna = 1; coluna <= largura; coluna++) {
                // Verifica se estamos na primeira ou última linha
                // para preencher todas as colunas com '+'
                if (linha == 1 || linha == altura) {
                    System.out.print('+');
                } else {
                    // Estamos em uma linha intermediária
                    // Preenche apenas as primeiras e últimas colunas com '+'
                    if (coluna == 1 || coluna == largura) {
                        System.out.print('+');
                    } else {
                        // Nas demais colunas, preenche com espaços em branco
                        System.out.print(' ');
                    }
                }
            }
            // Muda de linha após desenhar uma linha completa
            System.out.println();
        }
    }
}
