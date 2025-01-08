import java.util.Scanner;

public class Exercicio18 {
    // Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();

        System.out.print("Digite um angulo: ");
        double angulo = leitor.nextDouble();

        Exercicio18Modulo modulo = new Exercicio18Modulo();
        double seno = modulo.seno(angulo);
        double cosseno = modulo.cosseno(angulo);
        double tangente = modulo.tangente(angulo);

        System.out.println("O angulo %.2f tem o Seno: %.2f, Cosseno: %.2f e Tangente: %.2f"
                .formatted(angulo, seno, cosseno, tangente));
    }
}
