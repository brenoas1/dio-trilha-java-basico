import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        // Entrada do segundo número (precisa ser maior que o primeiro)
        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        // Validação simples
        if (segundoNumero <= primeiroNumero) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            return; // Encerra o programa se a entrada for inválida
        }

        // Escolha entre par ou ímpar
        System.out.print("Deseja ver os números 'pares' ou 'ímpares'? Digite P ou I: ");
        String escolha = scanner.next().toUpperCase();

        System.out.println("\nNúmeros no intervalo de " + segundoNumero + " até " + primeiroNumero + ":");

        // Laço de repetição decrescente
        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (escolha.equals("P") && i % 2 == 0) {
                System.out.println(i + " é par");
            } else if (escolha.equals("I") && i % 2 != 0) {
                System.out.println(i + " é ímpar");
            }
        }

        scanner.close();
    }
}
