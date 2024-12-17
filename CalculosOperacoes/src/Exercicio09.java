import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("A tabuada do %d é ->".formatted(numero));
        for (int i = 1; i <= 10; i++) {
            System.out.println("%d x %d = %d".formatted(numero, i, numero * i));
        }
    }
}
