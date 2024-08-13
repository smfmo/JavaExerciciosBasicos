package lista2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
        
        System.out.println("A média foi: " + media);
         media = scanner.nextDouble();
        scanner.close();
    }
}
