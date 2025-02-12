import java.util.Scanner;

public class Exercicio29 {
    private static final int velocidadeMaxima = 80;
    private static final double valorMultaPorKm = 7.0;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();
        System.out.print("Digite a velocidade do carro: ");
        int velocidade = leitor.nextInt();

        if (velocidade > velocidadeMaxima) {
            int velocidadeMultada = velocidade - velocidadeMaxima;
            double multa = velocidadeMultada * valorMultaPorKm;
            System.out.println("A velocidade permitida é %d e a multa foi de R$ %.2f".formatted(velocidadeMaxima, multa));
        } else {
            System.out.println("Dentro da velocidade permitida.");
        }
    }
}
