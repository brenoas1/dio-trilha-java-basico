import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode dirigir!");
        } else {
            System.out.println("Você ainda não pode dirigir.");
        }

        scanner.close();
    }
}

