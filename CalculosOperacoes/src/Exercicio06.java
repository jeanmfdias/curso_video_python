import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O dobro de %d é %d".formatted(numero, numero * 2));
        System.out.println("O triplo de %d é %d".formatted(numero, numero * 3));
        System.out.println("A raiz de %d é %.2f".formatted(numero, Math.sqrt(numero)));
    }
}
