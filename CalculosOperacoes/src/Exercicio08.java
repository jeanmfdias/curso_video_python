import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite uma medida em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("%.2f metros em centimetros é %.2f".formatted(metros, centimetros));
        System.out.println("%.2f metros em milimetros é %.2f".formatted(metros, milimetros));
    }
}
