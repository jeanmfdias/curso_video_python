import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = leitor.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
