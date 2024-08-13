import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número inteiro
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        // Verifique se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println(numero + " e um número par.");
        } else {
            System.out.println(numero + " e um número ímpar.");
        }

        // Feche o Scanner
        scanner.close();
    }
}

