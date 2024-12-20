import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();
        double desconto = 0.95;
        double valorComDesconto = valor * desconto;
        System.out.println("Valor com 5%s de desconto %.2f".formatted("%", valorComDesconto));
    }
}
