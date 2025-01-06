import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();
        System.out.print("Digite um número: ");
        double numero = leitor.nextDouble();

        Exercicio16Modulo modulo = new Exercicio16Modulo();
        int parteInteira = modulo.parteInteira(numero);
        System.out.println("O número é %.2f e sua parte inteira é %d".formatted(numero, parteInteira));
    }
}
