import java.util.Scanner; // Importamos a classe Scanner para ler dados do usuário

public class Exercício1 {

    public static void main(String[] args) {

        // Criamos um objeto Scanner para ler a entrada do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos ao usuário que digite um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt(); // Lê o número digitado e armazena na variável 'numero'

        // Imprimimos a tabuada do número de 1 até 10
        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Multiplicamos o número pelo contador 'i'
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechamos o scanner para liberar o recurso
        scanner.close();
    }
}

