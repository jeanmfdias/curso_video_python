import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = leitor.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
    }
}
