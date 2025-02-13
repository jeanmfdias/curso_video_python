import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();
        System.out.println("Verifica se é PAR ou ÍMPAR");
        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("%d é Par".formatted(numero));
        } else {
            System.out.println("%d é Ímpar".formatted(numero));
        }
    }
}
