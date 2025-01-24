import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        while (numero < 0 || numero > 9999) {
            System.out.print("Digite um número entre 0 a 9999: ");
            scanner.reset();
            numero = scanner.nextInt();
        }

        String[] numeroQuebrado = String.valueOf(numero).split("");
        System.out.print("Número separado por digito: ");
        for (String n : numeroQuebrado) {
            System.out.print("%s ".formatted(n));
        }
    }
}
