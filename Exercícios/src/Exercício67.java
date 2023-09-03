public class Exercício67 {
        public static void main(String[] args) {
            int soma = 0;
            int quantidadeNumeros = 0;
    
            for (int numero = 15; numero <= 100; numero++) {
                soma += numero;
                quantidadeNumeros++;
            }
    
            double mediaAritmetica = (double) soma / quantidadeNumeros;
    
            System.out.println("A média aritmética dos números entre 15 e 100 é: " + mediaAritmetica);
        }
  
}
