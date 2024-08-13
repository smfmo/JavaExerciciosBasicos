
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int d = scanner.nextInt();

        System.out.println("Valores divisíveis por 2 e 3:");

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println(a);
        }

        if (b % 2 == 0 && b % 3 == 0) {
            System.out.println(b);
        }

        if (c % 2 == 0 && c % 3 == 0) {
            System.out.println(c);
        }

        if (d % 2 == 0 && d % 3 == 0) {
            System.out.println(d);
        }

        scanner.close();
    }
}
