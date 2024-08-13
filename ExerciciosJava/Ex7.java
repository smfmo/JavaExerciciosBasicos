import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        if (numero1 > numero2){
            double temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3){
            double temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        
        System.out.println("Números em ordem crescente: " + numero1 + ", " + numero2 + ", "+ numero3);
        
        scanner.close();
    }
}