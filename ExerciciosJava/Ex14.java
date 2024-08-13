
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int resultado = numero * 2;
        
        if (resultado > 30) {
            System.out.println("O resultado da multiplicação por dois é: " + resultado);
        }
        
        scanner.close();
    }
}
