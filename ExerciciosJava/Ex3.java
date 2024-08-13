

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        
        System.out.println("Selecione o país de origem:");
        System.out.println("1. Estados Unidos: R$60,00");
        System.out.println("2. França: R$75,50");
        System.out.println("3. México: R$50,00");
        System.out.println("4. Argentina: R$27,35");
        System.out.println("5. China: R$80,00");
        System.out.print("Escolha o país (1-5): ");
        int escolha = scanner.nextInt();
        
        double frete;
        
        switch(escolha) {
            case 1:
                frete = 60.00;
                break;
            case 2:
                frete = 75.50;
                break;
            case 3:
                frete = 50.00;
                break;
            case 4:
                frete = 27.35;
                break;
            case 5:
                frete = 80.00;
                break;
            default:
                frete = 0.00; // Valor padrão se a escolha for inválida
        }
        
        double valorTotal = valorProduto + frete;
        
        System.out.println("Valor total do produto mais frete: " + valorTotal);
        
        scanner.close();
    }
}
