import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");
        int numero = scanner.nextInt();
        scanner.close();

        String diaDaSemana;

        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sabado";
                break;
            default:
                diaDaSemana = "Numero inválido, digite um numero de 1 a 7.";
        }

        System.out.println("O dia da semana correspondente ao numero " + numero + " eh " + diaDaSemana);
    }
}

