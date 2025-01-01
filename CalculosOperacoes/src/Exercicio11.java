import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite a largura: ");
        scanner.reset();
        double largura = scanner.nextDouble();

        double area = largura * altura;
        double litrosGastos = area / 2;
        System.out.println("A área é %.2f metros². E será necessário %.2f litros para pintar.".formatted(area, litrosGastos));
    }
}
