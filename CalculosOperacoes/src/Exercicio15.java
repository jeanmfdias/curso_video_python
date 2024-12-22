import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite os KM rodados: ");
        double km = scanner.nextDouble();
        scanner.reset();
        System.out.print("Digite os dias que foi alugado: ");
        int dias = scanner.nextInt();
        double valor = (km * 0.15) + (dias * 60);
        System.out.println("O valor do aluguel por %d dias é R$ %.2f".formatted(dias, valor));
    }
}
