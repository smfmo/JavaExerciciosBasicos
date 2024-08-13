import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        int temp;

        
        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }

        if (A > C) {
            temp = A;
            A = C;
            C = temp;
        }

        if (B > C) {
            temp = B;
            B = C;
            C = temp;
        }

     
        System.out.println("Valores em ordem crescente: " + A + ", " + B + ", " + C);

        
    }
}

