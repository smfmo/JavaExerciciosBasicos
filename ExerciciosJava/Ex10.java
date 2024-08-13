
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raízes reais: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Raíz real única: x1 = " + x1);
        } else {
            System.out.println("Não existem raízes reais");
        }

        scanner.close();
    }
}
