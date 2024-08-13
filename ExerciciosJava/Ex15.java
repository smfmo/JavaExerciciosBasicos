
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();
        
        int soma = A + B + C;
        
        if (soma >= 100) {
            System.out.println("A soma dos valores é: " + soma);
        }
        
        scanner.close();
    }
}
