package lista2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cardápio da Lanchonete:");
        System.out.println("100 - Cachorro Quente - R$1.20");
        System.out.println("101 - Bauru Simples - R$1.30");
        System.out.println("102 - Bauru com Ovo - R$1.50");
        System.out.println("103 - Hambúrguer - R$1.20");
        System.out.println("104 - Cheeseburguer - R$1.30");
        System.out.println("105 - Refrigerante - R$1.00");
        
        System.out.print("Digite o código do item pedido: ");
        int codigo = scanner.nextInt();
        
        double preco = 0.0;
        
        switch (codigo) {
            case 100:
                preco = 1.20;
                break;
            case 101:
                preco = 1.30;
                break;
            case 102:
                preco = 1.50;
                break;
            case 103:
                preco = 1.20;
                break;
            case 104:
                preco = 1.30;
                break;
            case 105:
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido. Por favor, escolha um código válido.");
                scanner.close();
                return;
        }
        
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();
        
        double valorTotal = preco * quantidade;
        
        System.out.println("Valor a ser pago: R$" + valorTotal);
        
        scanner.close();
    }
}
