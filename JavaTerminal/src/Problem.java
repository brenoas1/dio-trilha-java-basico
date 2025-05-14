import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler os dados de entrada
        Scanner sc = new Scanner(System.in);

        // Declara as variáveis para armazenar os dois valores inteiros e o produto
        int A, B, PROD;

        // Lê os dois inteiros A e B
        A = sc.nextInt();
        B = sc.nextInt();

        // Calcula o produto entre A e B e armazena na variável PROD
        PROD = A * B;

        // Exibe o resultado conforme o formato solicitado
        System.out.println("PROD = " + PROD);

        // Fecha o scanner para liberar recursos
        
    }
}
