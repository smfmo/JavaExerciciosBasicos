
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        if (!(valor > 3)) {
            System.out.println("Valor: " + valor);
        }

        scanner.close();
    }
}
