import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        double salarioComAumento = salario * 1.15;
        System.out.println("Salario R$ %.2f com aumento é R$ %.2f".formatted(salario, salarioComAumento));
    }
}
