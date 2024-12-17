import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O antecessor de %d é %d".formatted(numero, --numero));
        System.out.println("O sucessor de %d é %d".formatted(numero, ++numero));
    }
}
