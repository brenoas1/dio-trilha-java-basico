import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros, exemplo: 1,75 ou 1.75): ");
        String alturaStr = scanner.next().replace(",", ".");
        double altura = Double.parseDouble(alturaStr);

        System.out.print("Digite seu peso (em kg): ");
        String pesoStr = scanner.next().replace(",", ".");
        double peso = Double.parseDouble(pesoStr);

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }

        scanner.close();
    }
}
